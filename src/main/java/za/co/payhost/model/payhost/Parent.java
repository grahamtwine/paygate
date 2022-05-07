package za.co.payhost.model.payhost;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import za.co.payhost.Utilities;
import za.co.payhost.ui.PayGateFormProperties;

/**
 * Parent Class for all request types
 *
 * @author App Inlet (Pty) Ltd
 *
 * @version 1.0
 * @since 1.0
 */
public class Parent {

    /**
     * Utilties for all requests
     */
    protected Utilities util;
    /**
     * Primary za.co.payhost Object
     */
    protected PayHost payHost;

    Parent(PayHost payHost) {
        this.util = new Utilities();
        this.payHost = payHost;
    }

    /**
     *
     * Retreive util attribute
     *
     * @return utilities attribute of Class Utilities
     */
    public Utilities getUtil() {
        return util;
    }

    /**
     * Set utilities attribute
     *
     * @param util Object of type Utilities
     */
    public void setUtil(Utilities util) {
        this.util = util;
    }

    /**
     * Retreive payHost primary Object attribute
     *
     * @return payHost attribute
     */
    public PayHost getPayHost() {
        return payHost;
    }

    /**
     * Set payHost primary Object attribute
     *
     * @param payHost Primary Object for all requests
     */
    public void setPayHost(PayHost payHost) {
        this.payHost = payHost;
    }

    /**
     * Checks if is there any params related error from the server
     *
     * @param strResponse String
     * @return Boolean whether it has params realated error or not
     * @throws ParserConfigurationException Something
     * @throws SAXException Something
     * @throws IOException Something
     */
    public Boolean error(String strResponse) throws ParserConfigurationException, SAXException, IOException {
        return !this.getStatus(strResponse).getProperty("StatusName").equals("Error");
    }

    /**
     * Parse the resposne and get its status as object of Class "PayGateFormProperties"
     *
     * @param res The response of the post http request
     * @return object of Class "PayGateFormProperties"
     * @throws ParserConfigurationException ParserConfigurationException
     * @throws SAXException SAXException
     * @throws IOException IOException
     */
    public PayGateFormProperties getStatus(String res) throws ParserConfigurationException, SAXException, IOException {
        Document doc = parseXmlFromString(res);
        NodeList nodeList = doc.getElementsByTagName("ns2:Status");
        System.out.println(nodeList.item(0).getFirstChild().getTextContent());
        PayGateFormProperties obj = new PayGateFormProperties();
        System.out.println(nodeList.item(0).getChildNodes().getLength());
        for (int i = 0; i < 5; i++) {
            obj.setProperty(nodeList.item(0).getChildNodes().item(i).getNodeName().replace("ns2:", ""), nodeList.item(0).getChildNodes().item(i).getTextContent());
        }
        
        return obj;
    }

    /**
     * Parses the response
     *
     * @param xmlString The response of the http post request
     * @return DocumentBuilder object
     * @throws ParserConfigurationException ParserConfigurationException
     * @throws SAXException SAXException
     * @throws IOException IOException
     */
    public Document parseXmlFromString(String xmlString) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        
        InputStream inputStream = new ByteArrayInputStream(xmlString.getBytes());
        
        return builder.parse(inputStream);
    }

}

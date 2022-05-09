package za.co.liquidesign.services;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.xml.sax.SAXException;

public class PayHost {

	private String url = null;

	public PayHost(String url) {
		this.url = url;
	}

	/**
	 * Make an HTTP POST REQUEST
	 *
	 * @param url        Url of the request
	 * @param soapAction Action Name
	 * @param formFields Soap Message Body
	 * @return Http Post Response as String
	 * @throws ParserConfigurationException ParserConfigurationException
	 * @throws SAXException                 SAXException
	 * @throws IOException                  IOException
	 * @throws URISyntaxException
	 */
	public String execute(String soapAction, String data) throws IOException {

		StringEntity requestEntity = new StringEntity(data, "UTF-8");
		requestEntity.setChunked(true);

		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(requestEntity);
		httpPost.addHeader("Accept", "text/xml");
		httpPost.addHeader("Content-type", "text/xml");
		httpPost.addHeader("SOAPAction", soapAction);

		// Execute and get the response.
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = httpClient.execute(httpPost);
		int status = response.getStatusLine().getStatusCode();
		HttpEntity entity = response.getEntity();
		String strResponse = null;
		if (entity != null &&  status == 200) {
			strResponse = EntityUtils.toString(entity);
			if (strResponse!= null && !strResponse.isEmpty()) {
				return prettyFormat(strResponse);
			}
		}
		
		return status+"\n"+entity.getContentLength()+"\n"+strResponse;
	}

	/**
	 * Make the http post response pretty with indentation by default : 2
	 *
	 * @param input SOAP XML String
	 * @return String in pretty format
	 */
	private static String prettyFormat(String input) {
		try {
			System.out.println("Formating response =>"+input);
			Source xmlInput = new StreamSource(new StringReader(input));
			StringWriter stringWriter = new StringWriter();
			StreamResult xmlOutput = new StreamResult(stringWriter);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", 3);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(xmlInput, xmlOutput);

			return xmlOutput.getWriter().toString();

		} catch (IllegalArgumentException | TransformerException e) {
			e.printStackTrace();
		}
		
		return input;
	}
}

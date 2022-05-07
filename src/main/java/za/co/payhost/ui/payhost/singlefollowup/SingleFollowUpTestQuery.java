package za.co.payhost.ui.payhost.singlefollowup;

import static za.co.payhost.Utilities.prettyFormat;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import za.co.payhost.model.payhost.PayHost;
import za.co.payhost.model.payhost.SingleFollowUp;
import za.co.payhost.ui.Mockups;
import za.co.payhost.ui.PayGateFormProperties;

/**
 *
 * @author App Inlet (Pty) Ltd
 */
public class SingleFollowUpTestQuery extends javax.swing.JFrame {
	private static final long serialVersionUID = -6193600705575370369L;
	
	private String requestBody;
    private final String bigTitle = "SingleFollowUp";
    private final String title = "Query";

    /**
     * Creates new form SingleFollowUpTestQuery
     */
    public SingleFollowUpTestQuery() {
        initComponents();
        bigTitleLabel.setText(bigTitle);
        titleLabel.setText(title);
        reset();
        setVisible(true);
    }

    private void initComponents() {

        bigTitleLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        payGateIDField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        payRequestIDField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        responseArea = new javax.swing.JTextArea();
        defaultButton = new javax.swing.JButton();
        payGatIDField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Test");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bigTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        bigTitleLabel.setForeground(new java.awt.Color(0, 51, 153));
        bigTitleLabel.setText("SingleFollowUp");
        getContentPane().add(bigTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        titleLabel.setForeground(new java.awt.Color(0, 51, 153));
        titleLabel.setText("Query");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        payGateIDField.setFont(new java.awt.Font("Tahoma", 3, 14));
        payGateIDField.setForeground(new java.awt.Color(0, 0, 153));
        payGateIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payGateIDFieldActionPerformed(evt);
            }
        });
        payGateIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payGateIDFieldKeyTyped(evt);
            }
        });
        getContentPane().add(payGateIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 30));

        passwordField.setFont(new java.awt.Font("Tahoma", 3, 14));
        passwordField.setForeground(new java.awt.Color(0, 0, 153));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 30));

        payRequestIDField.setFont(new java.awt.Font("Tahoma", 3, 14));
        payRequestIDField.setForeground(new java.awt.Color(0, 0, 153));
        payRequestIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payRequestIDFieldKeyTyped(evt);
            }
        });
        getContentPane().add(payRequestIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 30));

        sendButton.setBackground(new java.awt.Color(0, 0, 204));
        sendButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setText("Send");
        sendButton.setToolTipText("Sample");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, 40));

        requestArea.setColumns(20);
        requestArea.setRows(5);
        requestArea.setToolTipText("[750, 510]");
        requestArea.setName("Test");
        jScrollPane1.setViewportView(requestArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 690, 220));

        responseArea.setColumns(20);
        responseArea.setRows(5);
        jScrollPane2.setViewportView(responseArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 690, 250));

        defaultButton.setBackground(new java.awt.Color(0, 0, 255));
        defaultButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        defaultButton.setForeground(new java.awt.Color(255, 255, 255));
        defaultButton.setText("Default");
        defaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(defaultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 280, 40));

        payGatIDField1.setFont(new java.awt.Font("Tahoma", 3, 14));
        payGatIDField1.setForeground(new java.awt.Color(0, 0, 153));
        payGatIDField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payGatIDField1ActionPerformed(evt);
            }
        });
        getContentPane().add(payGatIDField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 30));

        jLabel3.setText("Pay Gate ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setText("Pay Request ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        pack();
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void payGateIDFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void payGatIDField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void payGateIDFieldKeyTyped(java.awt.event.KeyEvent evt) {
    }

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void payRequestIDFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void defaultButtonActionPerformed(java.awt.event.ActionEvent evt) {
        reset();
    }

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            PayHost ph = new PayHost("https://secure.paygate.co.za/payhost/process.trans", "ns1");
            SingleFollowUp sfu = new SingleFollowUp(ph);
            PayGateFormProperties params = new PayGateFormProperties();
            params.setProperty("payGateID", payGateIDField.getText());
            params.setProperty("password", passwordField.getText());
            params.setProperty("payRequestID", payRequestIDField.getText());
            String res = sfu.query(params);
            responseArea.setText(prettyFormat(res));

        } catch (IOException | ParserConfigurationException | SAXException ex) {
            Logger.getLogger(SingleFollowUpTestQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * display params in text area
     */
    private void display() {
        String body = "<ns1:SingleFollowUpRequest>\n"
                + "	<ns1:QueryRequest>\n"
                + "		<ns1:Account>\n"
                + "			<ns1:PayGateId>" + payGateIDField.getText() + "</ns1:PayGateId>\n"
                + "			<ns1:Password>" + passwordField.getText() + "</ns1:Password>\n"
                + "		</ns1:Account>\n"
                + "		<ns1:PayRequestId>" + payRequestIDField.getText() + "</ns1:PayRequestId>\n"
                + "	</ns1:QueryRequest>\n"
                + "</ns1:SingleFollowUpRequest>\n";
        requestArea.setText(body);
    }

    /**
     * default params in text area
     */
    private void reset() {
        PayGateFormProperties m = Mockups.singleFollowUpQuery();

        String body = "<ns1:SingleFollowUpRequest>\n"
                + "	<ns1:QueryRequest>\n"
                + "		<ns1:Account>\n"
                + "			<ns1:PayGateId>" + m.getProperty("payGateID") + "</ns1:PayGateId>\n"
                + "			<ns1:Password>" + m.getProperty("password") + "</ns1:Password>\n"
                + "		</ns1:Account>\n"
                + "		<ns1:PayRequestId>" + m.getProperty("payRequestID") + "</ns1:PayRequestId>\n"
                + "	</ns1:QueryRequest>\n"
                + "</ns1:SingleFollowUpRequest>\n";
        payGateIDField.setText((String) m.getProperty("payGateID"));
        passwordField.setText((String) m.getProperty("password"));
        payRequestIDField.setText((String) m.getProperty("payRequestID"));
        requestArea.setText(body);
    }

    private javax.swing.JLabel bigTitleLabel;
    private javax.swing.JButton defaultButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField payGatIDField1;
    private javax.swing.JTextField payGateIDField;
    private javax.swing.JTextField payRequestIDField;
    private javax.swing.JTextArea requestArea;
    private javax.swing.JTextArea responseArea;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel titleLabel;
}

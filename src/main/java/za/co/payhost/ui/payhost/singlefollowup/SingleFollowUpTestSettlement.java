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


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author App Inlet (Pty) Ltd
 */
public class SingleFollowUpTestSettlement extends javax.swing.JFrame {
	private static final long serialVersionUID = 9026300194332896418L;
	
	private String requestBody;
    private final String bigTitle = "SingleFollowUp";
    private final String title = "Settlement";

    /**
     * Creates new form SingleFollowUpTestQuery
     */
    public SingleFollowUpTestSettlement() {
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
        transactionID = new javax.swing.JTextField();
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

        transactionID.setFont(new java.awt.Font("Tahoma", 3, 14));
        transactionID.setForeground(new java.awt.Color(0, 0, 153));
        transactionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionIDActionPerformed(evt);
            }
        });
        transactionID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transactionIDKeyTyped(evt);
            }
        });
        getContentPane().add(transactionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 30));

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
        getContentPane().add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 280, 40));

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
        getContentPane().add(defaultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 280, 40));

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

        jLabel5.setText("Transaction ID");
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
        display();
    }

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void transactionIDKeyTyped(java.awt.event.KeyEvent evt) {

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
            params.setProperty("transactionID", transactionID.getText());
            String res = sfu.settlment(params);
            responseArea.setText(prettyFormat(res));
            /*PayGateFormProperties status = sfu.getUtil().getStatus(res);
            if (sfu.error(res)) {
                // Request is denied
                System.out.println("Error : " + status.getProperty("ResultDescription"));
            } else {
                // Request is applied
                System.out.println("No Error");
            }*/

        } catch (IOException | ParserConfigurationException | SAXException ex) {
            Logger.getLogger(SingleFollowUpTestQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void transactionIDActionPerformed(java.awt.event.ActionEvent evt) {

    }

    /**
     * display params in text area
     */
    private void display() {

        String body = "<ns1:SingleFollowUpRequest>\n"
                + "	<ns1:SettlementRequest>\n"
                + "		<ns1:Account>\n"
                + "			<ns1:PayGateId>" + payGateIDField.getText() + "</ns1:PayGateId>\n"
                + "			<ns1:Password>" + passwordField.getText() + "</ns1:Password>\n"
                + "		</ns1:Account>\n"
                + "		<ns1:TransactionId>" + transactionID.getText() + "</ns1:TransactionId>\n"
                + "	</ns1:SettlementRequest>\n"
                + "</ns1:SingleFollowUpRequest>\n";
        requestArea.setText(body);
    }

    /**
     * default params in text area
     */
    private void reset() {

        PayGateFormProperties m = Mockups.singleFollowUpSettlement();

        String body = "<ns1:SingleFollowUpRequest>\n"
                + "	<ns1:SettlementRequest>\n"
                + "		<ns1:Account>\n"
                + "			<ns1:PayGateId>" + m.getProperty("payGateID") + "</ns1:PayGateId>\n"
                + "			<ns1:Password>" + m.getProperty("password") + "</ns1:Password>\n"
                + "		</ns1:Account>\n"
                + "		<ns1:TransactionId>" + m.getProperty("transactionID") + "</ns1:TransactionId>\n"
                + "	</ns1:SettlementRequest>\n"
                + "</ns1:SingleFollowUpRequest>\n";
        payGateIDField.setText((String) m.getProperty("payGateID"));
        passwordField.setText((String) m.getProperty("password"));
        transactionID.setText((String) m.getProperty("transactionID"));
        requestArea.setText(body);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SingleFollowUpTestQuery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleFollowUpTestQuery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleFollowUpTestQuery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleFollowUpTestQuery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SingleFollowUpTestSettlement().setVisible(true);
        });
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
    private javax.swing.JTextArea requestArea;
    private javax.swing.JTextArea responseArea;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField transactionID;
    // End of variables declaration//GEN-END:variables
}

package za.co.payhost.ui.payhost.singlepayment;

import static za.co.payhost.Utilities.prettyFormat;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import za.co.payhost.model.payhost.PayHost;
import za.co.payhost.model.payhost.SinglePayment;
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
public class WebPaymentTest extends javax.swing.JFrame {

    private String requestBody;
    private final String bigTitle = "WebPayment";
    private final String title = "";

    /**
     * Creates new form SinglePayoutTest
     */
    public WebPaymentTest() {
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
        firstnameField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        responseArea = new javax.swing.JTextArea();
        defaultButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lastnameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        notifyUrlField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        returnUrlField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        merchantOrderIDField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        currencyField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        transactionDateField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        billingTitleField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        billingFirstnameField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        billingLastnameField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        billingEmailField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        addressLineField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        payGateIDField7 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        zipField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        setTitle("Test");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bigTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        bigTitleLabel.setForeground(new java.awt.Color(0, 51, 153));
        bigTitleLabel.setText("SingleFollowUp");
        getContentPane().add(bigTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 20));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        titleLabel.setForeground(new java.awt.Color(0, 51, 153));
        titleLabel.setText("Query");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 0));

        payGateIDField.setFont(new java.awt.Font("Tahoma", 0, 12));
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
        getContentPane().add(payGateIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 25));

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 12));
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
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 25));

        firstnameField.setFont(new java.awt.Font("Tahoma", 0, 12));
        firstnameField.setForeground(new java.awt.Color(0, 0, 153));
        firstnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameFieldActionPerformed(evt);
            }
        });
        firstnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstnameFieldKeyTyped(evt);
            }
        });
        getContentPane().add(firstnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 25));

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
        getContentPane().add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 330, 40));

        requestArea.setColumns(20);
        requestArea.setRows(5);
        requestArea.setToolTipText("[750, 510]");
        requestArea.setName("Test");
        jScrollPane1.setViewportView(requestArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 690, 220));

        responseArea.setColumns(20);
        responseArea.setRows(5);
        jScrollPane2.setViewportView(responseArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 690, 230));

        defaultButton.setBackground(new java.awt.Color(0, 0, 255));
        defaultButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        defaultButton.setForeground(new java.awt.Color(255, 255, 255));
        defaultButton.setText("Default");
        defaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(defaultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 350, 40));

        jLabel3.setText("Address Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 110, -1));

        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setText("Firstname");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lastnameField.setFont(new java.awt.Font("Tahoma", 0, 12));
        lastnameField.setForeground(new java.awt.Color(0, 0, 153));
        lastnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameFieldActionPerformed(evt);
            }
        });
        lastnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastnameFieldKeyTyped(evt);
            }
        });
        getContentPane().add(lastnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 25));

        jLabel6.setText("Lastname");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        emailField.setFont(new java.awt.Font("Tahoma", 0, 12));
        emailField.setForeground(new java.awt.Color(0, 0, 153));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailFieldKeyTyped(evt);
            }
        });
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 220, 25));

        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        notifyUrlField.setFont(new java.awt.Font("Tahoma", 0, 12));
        notifyUrlField.setForeground(new java.awt.Color(0, 0, 153));
        notifyUrlField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyUrlFieldActionPerformed(evt);
            }
        });
        notifyUrlField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notifyUrlFieldKeyTyped(evt);
            }
        });
        getContentPane().add(notifyUrlField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 25));

        jLabel8.setText("Notify Url");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        returnUrlField.setFont(new java.awt.Font("Tahoma", 0, 12));
        returnUrlField.setForeground(new java.awt.Color(0, 0, 153));
        returnUrlField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnUrlFieldActionPerformed(evt);
            }
        });
        returnUrlField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                returnUrlFieldKeyTyped(evt);
            }
        });
        getContentPane().add(returnUrlField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 25));

        jLabel9.setText("Return Url");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        merchantOrderIDField.setFont(new java.awt.Font("Tahoma", 0, 12));
        merchantOrderIDField.setForeground(new java.awt.Color(0, 0, 153));
        merchantOrderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merchantOrderIDFieldActionPerformed(evt);
            }
        });
        merchantOrderIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                merchantOrderIDFieldKeyTyped(evt);
            }
        });
        getContentPane().add(merchantOrderIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 220, 25));

        jLabel10.setText("Merchant Order Id");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        currencyField.setFont(new java.awt.Font("Tahoma", 0, 12));
        currencyField.setForeground(new java.awt.Color(0, 0, 153));
        currencyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyFieldActionPerformed(evt);
            }
        });
        currencyField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                currencyFieldKeyTyped(evt);
            }
        });
        getContentPane().add(currencyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 220, 25));

        jLabel11.setText("Currency");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        amountField.setFont(new java.awt.Font("Tahoma", 0, 12));
        amountField.setForeground(new java.awt.Color(0, 0, 153));
        amountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFieldActionPerformed(evt);
            }
        });
        amountField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountFieldKeyTyped(evt);
            }
        });
        getContentPane().add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 220, 25));

        jLabel12.setText("Amount");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        titleField.setFont(new java.awt.Font("Tahoma", 0, 12));
        titleField.setForeground(new java.awt.Color(0, 0, 153));
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });
        titleField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                titleFieldKeyTyped(evt);
            }
        });
        getContentPane().add(titleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 25));

        jLabel13.setText("Title");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        transactionDateField.setFont(new java.awt.Font("Tahoma", 0, 12));
        transactionDateField.setForeground(new java.awt.Color(0, 0, 153));
        transactionDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionDateFieldActionPerformed(evt);
            }
        });
        transactionDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transactionDateFieldKeyTyped(evt);
            }
        });
        getContentPane().add(transactionDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 220, 25));

        jLabel14.setText("Transaction Date");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jLabel15.setText("Pay Gate ID");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, -1));

        billingTitleField.setFont(new java.awt.Font("Tahoma", 0, 12));
        billingTitleField.setForeground(new java.awt.Color(0, 0, 153));
        billingTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingTitleFieldActionPerformed(evt);
            }
        });
        billingTitleField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                billingTitleFieldKeyTyped(evt);
            }
        });
        getContentPane().add(billingTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 220, 25));

        jLabel16.setText("Title");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 80, -1));

        jLabel17.setText("Firstname");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 80, -1));

        billingFirstnameField.setFont(new java.awt.Font("Tahoma", 0, 12));
        billingFirstnameField.setForeground(new java.awt.Color(0, 0, 153));
        billingFirstnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingFirstnameFieldActionPerformed(evt);
            }
        });
        billingFirstnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                billingFirstnameFieldKeyTyped(evt);
            }
        });
        getContentPane().add(billingFirstnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 220, 25));

        jLabel18.setText("Lastname");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, -1));

        billingLastnameField.setFont(new java.awt.Font("Tahoma", 0, 12));
        billingLastnameField.setForeground(new java.awt.Color(0, 0, 153));
        billingLastnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingLastnameFieldActionPerformed(evt);
            }
        });
        billingLastnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                billingLastnameFieldKeyTyped(evt);
            }
        });
        getContentPane().add(billingLastnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 220, 25));

        jLabel19.setText("Email");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 80, -1));

        billingEmailField.setFont(new java.awt.Font("Tahoma", 0, 12));
        billingEmailField.setForeground(new java.awt.Color(0, 0, 153));
        billingEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingEmailFieldActionPerformed(evt);
            }
        });
        billingEmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                billingEmailFieldKeyTyped(evt);
            }
        });
        getContentPane().add(billingEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, 25));

        jLabel20.setText("Address Line");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 80, -1));

        addressLineField.setFont(new java.awt.Font("Tahoma", 0, 12));
        addressLineField.setForeground(new java.awt.Color(0, 0, 153));
        addressLineField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLineFieldActionPerformed(evt);
            }
        });
        addressLineField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressLineFieldKeyTyped(evt);
            }
        });
        getContentPane().add(addressLineField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 220, 25));

        jLabel21.setText("City");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 80, -1));

        cityField.setFont(new java.awt.Font("Tahoma", 0, 12));
        cityField.setForeground(new java.awt.Color(0, 0, 153));
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });
        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityFieldKeyTyped(evt);
            }
        });
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 220, 25));

        jLabel22.setText("Title");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 80, -1));

        payGateIDField7.setFont(new java.awt.Font("Tahoma", 0, 12));
        payGateIDField7.setForeground(new java.awt.Color(0, 0, 153));
        payGateIDField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payGateIDField7ActionPerformed(evt);
            }
        });
        payGateIDField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payGateIDField7KeyTyped(evt);
            }
        });
        getContentPane().add(payGateIDField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 220, 25));

        jLabel23.setText("State");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 80, -1));

        stateField.setFont(new java.awt.Font("Tahoma", 0, 12));
        stateField.setForeground(new java.awt.Color(0, 0, 153));
        stateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateFieldActionPerformed(evt);
            }
        });
        stateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stateFieldKeyTyped(evt);
            }
        });
        getContentPane().add(stateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 220, 25));

        jLabel24.setText("Country");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 80, -1));

        countryField.setFont(new java.awt.Font("Tahoma", 0, 12));
        countryField.setForeground(new java.awt.Color(0, 0, 153));
        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });
        countryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                countryFieldKeyTyped(evt);
            }
        });
        getContentPane().add(countryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 220, 25));

        jLabel25.setText("Zip");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 80, -1));

        zipField.setFont(new java.awt.Font("Tahoma", 0, 12));
        zipField.setForeground(new java.awt.Color(0, 0, 153));
        zipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipFieldActionPerformed(evt);
            }
        });
        zipField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zipFieldKeyTyped(evt);
            }
        });
        getContentPane().add(zipField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 220, 25));

        jLabel26.setText("Billing Details");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 80, -1));

        pack();
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void payGateIDFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void payGateIDFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void firstnameFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void defaultButtonActionPerformed(java.awt.event.ActionEvent evt) {

        reset();
    }

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            PayHost ph = new PayHost("https://secure.paygate.co.za/payhost/process.trans", "ns1");
            SinglePayment sp = new SinglePayment(ph);
            PayGateFormProperties params = new PayGateFormProperties();
            params.setProperty("payGateID", payGateIDField.getText());
            params.setProperty("password", passwordField.getText());
            params.setProperty("title", titleField.getText());
            params.setProperty("firstname", firstnameField.getText());
            params.setProperty("lastname", lastnameField.getText());
            params.setProperty("email", emailField.getText());
            params.setProperty("notifyUrl", notifyUrlField.getText());
            params.setProperty("returnUrl", returnUrlField.getText());
            params.setProperty("merchantOrderID", merchantOrderIDField.getText());
            params.setProperty("currency", currencyField.getText());
            params.setProperty("amount", amountField.getText());
            params.setProperty("transactionDate", transactionDateField.getText());
            String res = sp.webPayment(params);
            responseArea.setText(prettyFormat(res));

        } catch (IOException | ParserConfigurationException | SAXException ex) {
            Logger.getLogger(WebPaymentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void lastnameFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void lastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void firstnameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void emailFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void notifyUrlFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void notifyUrlFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void returnUrlFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void returnUrlFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void merchantOrderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void merchantOrderIDFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void currencyFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void currencyFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void amountFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void amountFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void titleFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void transactionDateFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void transactionDateFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void billingTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void billingTitleFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void billingFirstnameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void billingFirstnameFieldKeyTyped(java.awt.event.KeyEvent evt) {
        display();
    }

    private void billingLastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void billingLastnameFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void billingEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void billingEmailFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void addressLineFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void addressLineFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cityFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void payGateIDField7ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void payGateIDField7KeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void stateFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void stateFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void countryFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    private void zipFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void zipFieldKeyTyped(java.awt.event.KeyEvent evt) {

        display();
    }

    /**
     * display params in text area
     */
    private void display() {

        String body = "<ns1:SinglePaymentRequest>\n"
                + "	<ns1:WebPaymentRequest>\n"
                + "		<ns1:Account>\n"
                + "			<ns1:PayGateId>" + payGateIDField.getText() + "</ns1:PayGateId>\n"
                + "			<ns1:Password>" + passwordField.getText() + "</ns1:Password>\n"
                + "		</ns1:Account>\n"
                + "		<ns1:Customer>\n"
                + "			<ns1:Title>" + titleField.getText() + "</ns1:Title>\n"
                + "			<ns1:FirstName>" + firstnameField.getText() + "</ns1:FirstName>\n"
                + "			<ns1:LastName>" + lastnameField.getText() + "</ns1:LastName>\n"
                + "			<ns1:Email>" + emailField.getText() + "</ns1:Email>\n"
                + "		</ns1:Customer>\n"
                + "		<ns1:Redirect>\n"
                + "                 <ns1:NotifyUrl>" + notifyUrlField.getText() + "</ns1:NotifyUrl>\n"
                + "                 <ns1:ReturnUrl>" + returnUrlField.getText() + "</ns1:ReturnUrl>\n"
                + "		</ns1:Redirect>\n"
                + "		<ns1:Order>\n"
                + "			<ns1:MerchantOrderId>" + merchantOrderIDField.getText() + "</ns1:MerchantOrderId>\n"
                + "			<ns1:Currency>" + currencyField.getText() + "</ns1:Currency>\n"
                + "			<ns1:Amount>" + amountField.getText() + "</ns1:Amount>\n"
                + "			<ns1:TransactionDate>" + transactionDateField.getText() + "</ns1:TransactionDate>\n"
                + "		            <ns1:BillingDetails>\n"
                + "		                 <ns1:Customer>\n"
                + "		                     <ns1:Title>" + billingTitleField.getText() + "</ns1:Title>\n"
                + "		                     <ns1:FirstName>" + billingFirstnameField.getText() + "</ns1:FirstName>\n"
                + "		                     <ns1:LastName>" + billingLastnameField.getText() + "</ns1:LastName>\n"
                + "		                     <ns1:Email>" + billingEmailField.getText() + "</ns1:Email>\n"
                + "		                  </ns1:Customer>\n"
                + "		             <ns1:Address>\n"
                + "		                 <ns1:AddressLine>" + addressLineField.getText() + "</ns1:AddressLine>\n"
                + "		                 <ns1:City>" + cityField.getText() + "</ns1:City>\n"
                + "		                 <ns1:Country>" + countryField.getText() + "</ns1:Country>\n"
                + "		                 <ns1:State>" + stateField.getText() + "</ns1:State>\n"
                + "		                 <ns1:Zip>" + zipField.getText() + "</ns1:Zip>\n"
                + "		             </ns1:Address>\n"
                + "		        </ns1:BillingDetails>\n"
                + "		</ns1:Order>\n"
                + "	</ns1:WebPaymentRequest>\n"
                + "</ns1:SinglePaymentRequest>\n";
        requestArea.setText(body);
    }

    /**
     * default params in text area
     */
    private void reset() {

        PayGateFormProperties m = Mockups.singlePaymentWeb();

        String body = "<ns1:SinglePaymentRequest>\n"
                + "	<ns1:WebPaymentRequest>\n"
                + "		<ns1:Account>\n"
                + "			<ns1:PayGateId>" + m.getProperty("payGateID") + "</ns1:PayGateId>\n"
                + "			<ns1:Password>" + m.getProperty("password") + "</ns1:Password>\n"
                + "		</ns1:Account>\n"
                + "		<ns1:Customer>\n"
                + "			<ns1:Title>" + m.getProperty("title") + "</ns1:Title>\n"
                + "			<ns1:FirstName>" + m.getProperty("firstname") + "</ns1:FirstName>\n"
                + "			<ns1:LastName>" + m.getProperty("lastname") + "</ns1:LastName>\n"
                + "			<ns1:Email>" + m.getProperty("email") + "</ns1:Email>\n"
                + "		</ns1:Customer>\n"
                + "		<ns1:Redirect>\n"
                + "                 <ns1:NotifyUrl>" + m.getProperty("notifyUrl") + "</ns1:NotifyUrl>\n"
                + "                 <ns1:ReturnUrl>" + m.getProperty("returnUrl") + "</ns1:ReturnUrl>\n"
                + "		</ns1:Redirect>\n"
                + "		<ns1:Order>\n"
                + "			<ns1:MerchantOrderId>" + m.getProperty("merchantOrderID") + "</ns1:MerchantOrderId>\n"
                + "			<ns1:Currency>" + m.getProperty("currency") + "</ns1:Currency>\n"
                + "			<ns1:Amount>" + m.getProperty("amount") + "</ns1:Amount>\n"
                + "			<ns1:TransactionDate>" + m.getProperty("transactionDate") + "</ns1:TransactionDate>\n"
                + "            <ns1:BillingDetails>\n"
                + "                 <ns1:Customer>\n"
                + "                     <ns1:Title>" + m.getProperty("title") + "</ns1:Title>\n"
                + "                     <ns1:FirstName>" + m.getProperty("firstname") + "</ns1:FirstName>\n"
                + "                     <ns1:LastName>" + m.getProperty("lastname") + "</ns1:LastName>\n"
                + "                     <ns1:Email>" + m.getProperty("email") + "</ns1:Email>\n"
                + "                  </ns1:Customer>\n"
                + "             <ns1:Address>\n"
                + "                 <ns1:AddressLine>" + m.getProperty("addressLine") + "</ns1:AddressLine>\n"
                + "                 <ns1:City>" + m.getProperty("city") + "</ns1:City>\n"
                + "                 <ns1:Country>" + m.getProperty("country") + "</ns1:Country>\n"
                + "                 <ns1:State>" + m.getProperty("state") + "</ns1:State>\n"
                + "                 <ns1:Zip>" + m.getProperty("zip") + "</ns1:Zip>\n"
                + "             </ns1:Address>\n"
                + "             </ns1:BillingDetails>\n"
                + "		</ns1:Order>\n"
                + "	</ns1:WebPaymentRequest>\n"
                + "</ns1:SinglePaymentRequest>\n";
        payGateIDField.setText((String) m.getProperty("payGateID"));
        passwordField.setText((String) m.getProperty("password"));
        titleField.setText((String) m.getProperty("title"));
        firstnameField.setText((String) m.getProperty("firstname"));
        lastnameField.setText((String) m.getProperty("lastname"));
        emailField.setText((String) m.getProperty("email"));
        notifyUrlField.setText((String) m.getProperty("notifyUrl"));
        returnUrlField.setText((String) m.getProperty("returnUrl"));
        merchantOrderIDField.setText((String) m.getProperty("merchantOrderID"));
        currencyField.setText((String) m.getProperty("currency"));
        amountField.setText((String) m.getProperty("amount"));
        transactionDateField.setText((String) m.getProperty("transactionDate"));
        billingTitleField.setText((String) m.getProperty("billingTitle"));
        billingFirstnameField.setText((String) m.getProperty("billingFirstname"));
        billingLastnameField.setText((String) m.getProperty("billingLastname"));
        billingEmailField.setText((String) m.getProperty("billingEmail"));
        addressLineField.setText((String) m.getProperty("addressLine"));
        cityField.setText((String) m.getProperty("city"));
        stateField.setText((String) m.getProperty("state"));
        countryField.setText((String) m.getProperty("country"));
        zipField.setText((String) m.getProperty("zip"));
        requestArea.setText(body);
    }

    private javax.swing.JTextField addressLineField;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel bigTitleLabel;
    private javax.swing.JTextField billingEmailField;
    private javax.swing.JTextField billingFirstnameField;
    private javax.swing.JTextField billingLastnameField;
    private javax.swing.JTextField billingTitleField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField countryField;
    private javax.swing.JTextField currencyField;
    private javax.swing.JButton defaultButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JTextField merchantOrderIDField;
    private javax.swing.JTextField notifyUrlField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField payGateIDField;
    private javax.swing.JTextField payGateIDField7;
    private javax.swing.JTextArea requestArea;
    private javax.swing.JTextArea responseArea;
    private javax.swing.JTextField returnUrlField;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField stateField;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField transactionDateField;
    private javax.swing.JTextField zipField;
    // End of variables declaration//GEN-END:variables
}

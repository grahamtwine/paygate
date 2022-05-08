package za.co.payhost.ui.payhost.payment;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;
import za.co.payhost.ui.payhost.PayHostWindow;

public class WebPayment extends PayHostWindow {
	private static final long serialVersionUID = 3948861973002213901L;

	private JTextField payGateIDField;
	private JTextField passwordField;

	private JTextField titleField;
	private JTextField firstnameField;
	private JTextField lastnameField;
	private JTextField emailField;
	private JTextField addressLineField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField countryField;
	private JTextField zipField;

	private JTextField billingEmailField;
	private JTextField billingFirstnameField;
	private JTextField billingLastnameField;
	private JTextField billingTitleField;

	private JTextField notifyUrlField;
	private JTextField returnUrlField;

	private JTextField merchantOrderIDField;
	private JTextField transactionDateField;
	private JTextField currencyField;
	private JTextField amountField;
	
	public WebPayment() {
		super("Web Payment", "WebPaymentRequest");
	}

	@Override
	protected void createMenu() {
		payGateIDField = createTextField(UIUtils.PAYGATEID);
		passwordField = createTextField(UIUtils.PAYGATEID);

		titleField = createTextField(UIUtils.PAYGATEID);
		firstnameField = createTextField(UIUtils.PAYGATEID);
		lastnameField = createTextField(UIUtils.PAYGATEID);
		emailField = createTextField(UIUtils.PAYGATEID);
		addressLineField = createTextField(UIUtils.PAYGATEID);
		cityField = createTextField(UIUtils.PAYGATEID);
		stateField = createTextField(UIUtils.PAYGATEID);
		countryField = createTextField(UIUtils.PAYGATEID);
		zipField = createTextField(UIUtils.PAYGATEID);

		billingEmailField = createTextField(UIUtils.PAYGATEID);
		billingFirstnameField = createTextField(UIUtils.PAYGATEID);
		billingLastnameField = createTextField(UIUtils.PAYGATEID);
		billingTitleField = createTextField(UIUtils.PAYGATEID);

		notifyUrlField = createTextField(UIUtils.PAYGATEID);
		returnUrlField = createTextField(UIUtils.PAYGATEID);

		merchantOrderIDField = createTextField(UIUtils.PAYGATEID);
		transactionDateField = createTextField(UIUtils.PAYGATEID);
		currencyField = createTextField(UIUtils.PAYGATEID);
		amountField = createTextField(UIUtils.PAYGATEID);
	}


	@Override
	protected void resetFormToDefaultValues() {
		webPayment();
		
		payGateIDField.setText(formFields.getProperty(UIUtils.PAYGATEID));
		passwordField.setText(formFields.getProperty(UIUtils.PASSWORD));
		titleField.setText(formFields.getProperty(UIUtils.TITLE));
		firstnameField.setText(formFields.getProperty(UIUtils.FIRST_NAME));
		lastnameField.setText(formFields.getProperty(UIUtils.LAST_NAME));
		emailField.setText(formFields.getProperty(UIUtils.EMAIL));
		notifyUrlField.setText(formFields.getProperty(UIUtils.NOTIFY_URL));
		returnUrlField.setText(formFields.getProperty(UIUtils.RETURN_URL));
		merchantOrderIDField.setText(formFields.getProperty(UIUtils.MERCHANT_ORDER_ID));
		currencyField.setText(formFields.getProperty(UIUtils.CURRENCY));
		amountField.setText(formFields.getProperty(UIUtils.AMOUNT));
		transactionDateField.setText(formFields.getProperty(UIUtils.TRANSACTIONDATE));
		billingTitleField.setText(formFields.getProperty("billingTitle"));
		billingFirstnameField.setText(formFields.getProperty("billingFirstname"));
		billingLastnameField.setText(formFields.getProperty("billingLastname"));
		billingEmailField.setText(formFields.getProperty("billingEmail"));
		addressLineField.setText(formFields.getProperty("addressLine"));
		cityField.setText(formFields.getProperty("city"));
		stateField.setText(formFields.getProperty("state"));
		countryField.setText(formFields.getProperty(UIUtils.COUNTRY));
		zipField.setText(formFields.getProperty("zip"));
	}
	
	private void webPayment() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty(UIUtils.TITLE, "Mr");
		formFields.setProperty(UIUtils.FIRST_NAME, "Joe");
		formFields.setProperty(UIUtils.LAST_NAME, "Soap");
		formFields.setProperty(UIUtils.EMAIL, "joes@example.com");
		formFields.setProperty(UIUtils.NOTIFY_URL, "https://www.mytestsite.com/notify");
		formFields.setProperty(UIUtils.RETURN_URL, "https://www.mytestsite.com/return");
		formFields.setProperty(UIUtils.MERCHANT_ORDER_ID, "order-1234");
		formFields.setProperty(UIUtils.CURRENCY, "ZAR");
		formFields.setProperty(UIUtils.AMOUNT, "100");
		formFields.setProperty(UIUtils.TRANSACTIONDATE, "2014-04-06T18:30:00+02:00");
		formFields.setProperty("billingTitle", "Mr");
		formFields.setProperty("billingFirstname", "PayGate");
		formFields.setProperty("billingLastname", "Test");
		formFields.setProperty("billingEmail", "itsupport@paygate.co.za");
		formFields.setProperty("addressLine", "Apartment 2A");
		formFields.setProperty("city", "Cape Town");
		formFields.setProperty("state", "Western Cape");
		formFields.setProperty(UIUtils.COUNTRY, "ZAF");
		formFields.setProperty("zip", "7700");
	}
}

package za.co.liquidesign.ui.payhost.payment;

import javax.swing.JTextField;

import za.co.liquidesign.ui.UIUtils;
import za.co.liquidesign.ui.payhost.PayHostWindow;

public class CardPayment extends PayHostWindow {
	private static final long serialVersionUID = 1754660722818841122L;

	private JTextField payGateId;
	private JTextField password;

	private JTextField customerTitle;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField telephoneNumber;
	private JTextField mobileNumber;
	private JTextField emailAddress;

	private JTextField cardNumber;
	private JTextField cardExpiryDate;
	private JTextField cvvNumber;
	private JTextField budgetPeriod;

	private JTextField notifyUrl;
	private JTextField returnUrl;

	private JTextField merchantOrderId;
	private JTextField currency;
	private JTextField amount;

	private JTextField transactionDate;
	
	public CardPayment() {
		super("Card Payment", "CardPaymentRequest", "SinglePaymentRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		customerTitle = createTextField(UIUtils.TITLE);
		firstName = createTextField(UIUtils.FIRST_NAME);
		lastName = createTextField(UIUtils.LAST_NAME);
		telephoneNumber = createTextField(UIUtils.TELEPHONE_NUMBER);
		mobileNumber = createTextField(UIUtils.MOBILE_NUMBER);
		emailAddress = createTextField(UIUtils.EMAIL);

		cardNumber = createTextField(UIUtils.CARD_NUMBER);
		cardExpiryDate = createTextField(UIUtils.CARD_EXPIRY_DATE);
		cvvNumber = createTextField(UIUtils.CVV_NUMBER);
		budgetPeriod = createTextField(UIUtils.BUDGET_PERIOD);

		notifyUrl = createTextField(UIUtils.NOTIFY_URL);
		returnUrl = createTextField(UIUtils.RETURN_URL);

		merchantOrderId = createTextField(UIUtils.MERCHANT_ORDER_ID);
		currency = createTextField(UIUtils.CURRENCY);
		amount = createTextField(UIUtils.AMOUNT);

		transactionDate = createTextField(UIUtils.TRANSACTIONDATE);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem(UIUtils.TITLE, customerTitle);
		addMenuItem("First Name", firstName);
		addMenuItem("Last Name", lastName);
		addMenuItem("Telephone Number", telephoneNumber);
		addMenuItem("Mobile Number", mobileNumber);
		addMenuItem("Email Address", emailAddress);

		addMenuItem("Card Number", cardNumber);
		addMenuItem("Card Expiry Date ( MM/YY )", cardExpiryDate);
		addMenuItem("CVV Number", cvvNumber);
		addMenuItem("Budget Period ( Months )", budgetPeriod);

		addMenuItem("Notify URL", notifyUrl);
		addMenuItem("Return URL", returnUrl);

		addMenuItem("Merchant Order ID", merchantOrderId);
		addMenuItem(UIUtils.CURRENCY, currency);
		addMenuItem(UIUtils.AMOUNT, amount);
		addMenuItem("Transaction Date", transactionDate);
	}

	@Override
	protected void resetFormToDefaultValues() {
		singlePaymentCardSimple();
		
		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		customerTitle.setText(formFields.getProperty("customerTitle"));
		firstName.setText(formFields.getProperty(UIUtils.FIRST_NAME));
		lastName.setText(formFields.getProperty(UIUtils.LAST_NAME));
		emailAddress.setText(formFields.getProperty("emailAddress"));
		notifyUrl.setText(formFields.getProperty(UIUtils.NOTIFY_URL));
		returnUrl.setText(formFields.getProperty(UIUtils.RETURN_URL));
		merchantOrderId.setText(formFields.getProperty(UIUtils.MERCHANT_ORDER_ID));
		currency.setText(formFields.getProperty(UIUtils.CURRENCY));
		amount.setText(formFields.getProperty(UIUtils.AMOUNT));
		cardNumber.setText(formFields.getProperty(UIUtils.CARD_NUMBER));
		cardExpiryDate.setText(formFields.getProperty(UIUtils.CARD_EXPIRY_DATE));
		cvvNumber.setText(formFields.getProperty("cvv"));
		budgetPeriod.setText(formFields.getProperty("budgetPeriod"));
		mobileNumber.setText(formFields.getProperty("mobile"));
		telephoneNumber.setText(formFields.getProperty("telephone"));
		transactionDate.setText(formFields.getProperty(UIUtils.TRANSACTIONDATE));
	}

	private void singlePaymentCardSimple() {
		
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty(UIUtils.TITLE, "Mr");
		formFields.setProperty(UIUtils.FIRST_NAME, "Joe");
		formFields.setProperty(UIUtils.LAST_NAME, "Soap");
		formFields.setProperty(UIUtils.EMAIL, "joes@example.com");
		formFields.setProperty("telephone", "0861234567");
		formFields.setProperty("mobile", "0735552233");
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
		formFields.setProperty(UIUtils.CARD_NUMBER, "4000000000000002");
		formFields.setProperty(UIUtils.CARD_EXPIRY_DATE, "122019");
		formFields.setProperty("cvv", "999");
		formFields.setProperty("budgetPeriod", "0");
	}
}

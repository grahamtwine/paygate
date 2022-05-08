package za.co.liquidesign.ui.payhost.singlepayout;

import javax.swing.JTextField;

import za.co.liquidesign.ui.UIUtils;
import za.co.liquidesign.ui.payhost.PayHostWindow;

public class SinglePayout extends PayHostWindow {
	private static final long serialVersionUID = 5880468907254233136L;

	private JTextField payGateId;
	private JTextField password;

	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;

	private JTextField cardExpiryDate;
	private JTextField cardNumber;

	private JTextField merchantOrderId;
	private JTextField currency;
	private JTextField amount;

	public SinglePayout() {
		super("Payout", "CardPayoutRequest", "SinglePayoutRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		firstName = createTextField(UIUtils.FIRST_NAME);
		lastName = createTextField(UIUtils.LAST_NAME);
		email = createTextField(UIUtils.EMAIL);

		cardNumber = createTextField(UIUtils.CARD_NUMBER);
		cardExpiryDate = createTextField(UIUtils.CARD_EXPIRY_DATE);

		merchantOrderId = createTextField(UIUtils.MERCHANT_ORDER_ID);
		currency = createTextField(UIUtils.CURRENCY);
		amount = createTextField(UIUtils.AMOUNT);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem("First Name", firstName);
		addMenuItem("Last Name", lastName);
		addMenuItem("Email Address", email);

		addMenuItem("Card Number", cardNumber);
		addMenuItem("Card Expiry Date", cardExpiryDate);

		addMenuItem("Merchant Order ID", merchantOrderId);
		addMenuItem(UIUtils.CURRENCY, currency);
		addMenuItem(UIUtils.AMOUNT, amount);
	}

	@Override
	protected void resetFormToDefaultValues() {
		singlePayout();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));

		firstName.setText(formFields.getProperty(UIUtils.FIRST_NAME));
		lastName.setText(formFields.getProperty(UIUtils.LAST_NAME));
		email.setText(formFields.getProperty(UIUtils.EMAIL));

		cardNumber.setText(formFields.getProperty(UIUtils.CARD_NUMBER));
		cardExpiryDate.setText(formFields.getProperty(UIUtils.CARD_EXPIRY_DATE));

		merchantOrderId.setText(formFields.getProperty(UIUtils.MERCHANT_ORDER_ID));
		currency.setText(formFields.getProperty(UIUtils.CURRENCY));
		amount.setText(formFields.getProperty(UIUtils.AMOUNT));
	}

	private void singlePayout() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");

		formFields.setProperty(UIUtils.FIRST_NAME, "Joe");
		formFields.setProperty(UIUtils.LAST_NAME, "Soap");
		formFields.setProperty(UIUtils.EMAIL, "joes@example.com");

		formFields.setProperty(UIUtils.CARD_NUMBER, "4000000000000002");
		formFields.setProperty(UIUtils.CARD_EXPIRY_DATE, "052015");

		formFields.setProperty(UIUtils.MERCHANT_ORDER_ID, "order-1234");
		formFields.setProperty(UIUtils.CURRENCY, "ZAR");

		formFields.setProperty(UIUtils.AMOUNT, "100");
	}
}

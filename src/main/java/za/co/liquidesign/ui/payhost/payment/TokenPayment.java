package za.co.liquidesign.ui.payhost.payment;

import javax.swing.JTextField;

import za.co.liquidesign.ui.UIUtils;
import za.co.liquidesign.ui.payhost.PayHostWindow;

public class TokenPayment extends PayHostWindow {
	private static final long serialVersionUID = -1559314388679371904L;

	private JTextField payGateId;
	private JTextField password;

	private JTextField customerTitle;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField emailAddress;

	private JTextField token;
	private JTextField tokenDetail;

	private JTextField merchantOrderId;
	private JTextField currency;
	private JTextField amount;

	public TokenPayment() {
		super("Token Payment", "TokenPaymentRequest", "SinglePaymentRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		customerTitle = createTextField(UIUtils.TITLE);
		firstName = createTextField(UIUtils.FIRST_NAME);
		lastName = createTextField(UIUtils.LAST_NAME);
		emailAddress = createTextField(UIUtils.EMAIL);

		token = createTextField(UIUtils.TOKEN);
		tokenDetail = createTextField(UIUtils.TOKEN_DETAIL);

		merchantOrderId = createTextField(UIUtils.MERCHANT_ORDER_ID);
		currency = createTextField(UIUtils.CURRENCY);
		amount = createTextField(UIUtils.AMOUNT);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem(UIUtils.TITLE, customerTitle);
		addMenuItem("First Name", firstName);
		addMenuItem("Last Name", lastName);
		addMenuItem("Email Address", emailAddress);

		addMenuItem(UIUtils.TOKEN, token);
		addMenuItem("Token Detail", tokenDetail);

		addMenuItem("Merchant Order ID", merchantOrderId);
		addMenuItem(UIUtils.CURRENCY, currency);
		addMenuItem(UIUtils.AMOUNT, amount);
	}

	@Override
	protected void resetFormToDefaultValues() {
		tokenPayment();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		token.setText(formFields.getProperty(UIUtils.TOKEN));
		tokenDetail.setText(formFields.getProperty(UIUtils.TOKEN_DETAIL));
		merchantOrderId.setText(formFields.getProperty(UIUtils.MERCHANT_ORDER_ID));
		currency.setText(formFields.getProperty(UIUtils.CURRENCY));
		amount.setText(formFields.getProperty(UIUtils.AMOUNT));
	}

	private void tokenPayment() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty(UIUtils.TOKEN, "2258098676320541501");
		formFields.setProperty(UIUtils.TOKEN_DETAIL, "VCO");
		formFields.setProperty(UIUtils.MERCHANT_ORDER_ID, "order-1234");
		formFields.setProperty(UIUtils.CURRENCY, "ZAR");
		formFields.setProperty(UIUtils.AMOUNT, "100");
	}
}

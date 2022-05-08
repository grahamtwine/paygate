package za.co.payhost.ui.payweb3;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public class Initiate extends PayWeb3Window {
	private static final long serialVersionUID = -5292377015097939903L;

	public Initiate() {
		super(UIUtils.PAYWEB3_INITIATE, UIUtils.PAYWEB3_INITIATE_ENDPOINT);
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATE_ID);
		reference = createTextField(UIUtils.REFERENCE);
		localeCode = createTextField(UIUtils.LOCALE);
		checksum = createTextField(UIUtils.CHECKSUM);
		email = createTextField(UIUtils.EMAIL);
		notifyUrl = createTextField(UIUtils.NOTIFY_URL);
		returnUrl = createTextField(UIUtils.RETURN_URL);
		currency = createTextField(UIUtils.CURRENCY);
		amount = createTextField(UIUtils.AMOUNT);
		transactionDate = createTextField(UIUtils.TRANSACTION_DATE);
		countryCode = createTextField(UIUtils.COUNTRY);

		addMenuItem("Pay Gate ID", payGateId);
		addMenuItem("Reference", reference);
		addMenuItem("Locale", localeCode);
		addMenuItem("Checksum", checksum);
		addMenuItem("Email Address", email);
		addMenuItem("Notify URL", notifyUrl);
		addMenuItem("Return URL", returnUrl);
		addMenuItem(UIUtils.CURRENCY, currency);
		addMenuItem(UIUtils.AMOUNT, amount);
		addMenuItem("Transaction Date", transactionDate);
		addMenuItem(UIUtils.COUNTRY, countryCode);
	}

	@Override
	protected void resetFormToDefaultValues() {
		paywebInitiate();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATE_ID));
		reference.setText(formFields.getProperty(UIUtils.REFERENCE));
		transactionDate.setText(formFields.getProperty(UIUtils.TRANSACTION_DATE));
		localeCode.setText(formFields.getProperty(UIUtils.LOCALE));
		checksum.setText(formFields.getProperty(UIUtils.CHECKSUM));
		email.setText(formFields.getProperty(UIUtils.EMAIL));
		notifyUrl.setText(formFields.getProperty(UIUtils.NOTIFY_URL));
		returnUrl.setText(formFields.getProperty(UIUtils.RETURN_URL));
		currency.setText(formFields.getProperty(UIUtils.CURRENCY));
		amount.setText(formFields.getProperty(UIUtils.AMOUNT));
		countryCode.setText(formFields.getProperty(UIUtils.COUNTRY));

		requestArea.setText(formFields.toString());
	}

	/**
	 * paywebInitiate Properties
	 *
	 * @return FormFields
	 */
	private void paywebInitiate() {
		formFields.setProperty(UIUtils.PAYGATE_ID, "10011072130");
		formFields.setProperty(UIUtils.REFERENCE, "pgtest_123456789");
		formFields.setProperty(UIUtils.AMOUNT, "3299");
		formFields.setProperty(UIUtils.CURRENCY, "ZAR");
		formFields.setProperty(UIUtils.NOTIFY_URL, "");
		formFields.setProperty(UIUtils.RETURN_URL, "https://my.return.url/page");
		formFields.setProperty(UIUtils.TRANSACTION_DATE, "2018-01-01 12:00:00");
		formFields.setProperty(UIUtils.LOCALE, "en-za");
		formFields.setProperty(UIUtils.COUNTRY, "ZAF");
		formFields.setProperty(UIUtils.EMAIL, "customer@paygate.co.za");
		formFields.setProperty(UIUtils.CHECKSUM, "59229d9c6cb336ae4bd287c87e6f0220");
	}

	private JTextField payGateId;
	private JTextField reference;
	private JTextField localeCode;
	private JTextField checksum;
	private JTextField email;
	private JTextField notifyUrl;
	private JTextField returnUrl;
	private JTextField currency;
	private JTextField amount;
	private JTextField transactionDate;
	private JTextField countryCode;
}

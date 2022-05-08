package za.co.payhost.ui.payweb3;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public class Query extends PayWeb3Window {
	private static final long serialVersionUID = -511034254785983399L;

	public Query() {
		super(UIUtils.PAYWEB3_QUERY, UIUtils.PAYWEB3_QUERY_ENDPOINT);
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATE_ID);
		checksum = createTextField(UIUtils.CHECKSUM);
		payRequestId = createTextField(UIUtils.PAY_REQUEST_ID);
		reference = createTextField(UIUtils.REFERENCE);

		addMenuItem("Pay Gate ID", payGateId);
		addMenuItem("Reference", reference);
		addMenuItem("Pay Request ID", payRequestId);
		addMenuItem("Checksum", checksum);
	}

	@Override
	protected void resetFormToDefaultValues() {
		paywebQuery();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATE_ID));
		reference.setText(formFields.getProperty(UIUtils.REFERENCE));
		payRequestId.setText(formFields.getProperty(UIUtils.PAY_REQUEST_ID));
		checksum.setText(formFields.getProperty(UIUtils.CHECKSUM));

		requestArea.setText(formFields.toString());
	}

	/**
	 * paywebQuery Properties
	 *
	 * @return FormFields
	 */
	private void paywebQuery() {
		formFields.setProperty(UIUtils.PAYGATE_ID, "10011072130");
		formFields.setProperty(UIUtils.REFERENCE, "pgtest_123456789");
		formFields.setProperty(UIUtils.PAY_REQUEST_ID, "23B785AE-C96C-32AF-4879-D2C9363DB6E8");
		formFields.setProperty(UIUtils.CHECKSUM, "b41a77f83a275a849f23e30b4666e837");
	}

	private JTextField payGateId;
	private JTextField reference;
	private JTextField checksum;
	private JTextField payRequestId;
}

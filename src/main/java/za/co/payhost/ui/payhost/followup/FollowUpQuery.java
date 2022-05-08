package za.co.payhost.ui.payhost.followup;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;
import za.co.payhost.ui.payhost.PayHostWindow;

public class FollowUpQuery extends PayHostWindow {
	private static final long serialVersionUID = -6193600705575370369L;

	private JTextField payGateId;
	private JTextField password;
	private JTextField payRequestId;

	public FollowUpQuery() {
		super("Follow up Query", "QueryRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		payRequestId = createTextField(UIUtils.PAYREQUESTID);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem("PayGate Request ID", payRequestId);
	}

	@Override
	protected void resetFormToDefaultValues() {
		followUpQuery();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		payRequestId.setText(formFields.getProperty("payRequestID"));
	}

	private void followUpQuery() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty("payRequestID", "6B739421-C177-903F-B23A-4BC1F09AB791");
		formFields.setProperty(UIUtils.PASSWORD, "test");
	}
}

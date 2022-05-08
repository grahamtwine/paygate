package za.co.payhost.ui.payhost.followup;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;
import za.co.payhost.ui.payhost.PayHostWindow;

public class FollowUpSettlement extends PayHostWindow {
	private static final long serialVersionUID = 9026300194332896418L;

	private JTextField payGateId;
	private JTextField password;
	private JTextField transactionId;

	public FollowUpSettlement() {
		super("Followup Settlement", "SettlementRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		transactionId = createTextField(UIUtils.TRANSACTION_ID);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem("Transaction ID", transactionId);
	}

	@Override
	protected void resetFormToDefaultValues() {
		followUpSettlement();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		transactionId.setText(formFields.getProperty("transactionID"));
	}

	private void followUpSettlement() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty("transactionID", "28790224");
	}
}

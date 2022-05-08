package za.co.liquidesign.ui.payhost.followup;

import javax.swing.JTextField;

import za.co.liquidesign.ui.UIUtils;
import za.co.liquidesign.ui.payhost.PayHostWindow;

public class FollowUpVoid extends PayHostWindow {
	private static final long serialVersionUID = -1531219516303587229L;

	private JTextField payGateId;
	private JTextField password;

	private JTextField transactionId;
	private JTextField transactionType;

	public FollowUpVoid() {
		super("Follow Up Void", "VoidRequest", "SingleFollowUpRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		transactionId = createTextField(UIUtils.TRANSACTION_ID);
		transactionType = createTextField(UIUtils.TRANSACTION_TYPE);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem("Transaction ID", transactionId);
		addMenuItem("TransactionType", transactionType);
	}

	@Override
	protected void resetFormToDefaultValues() {
		followUpVoid();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		transactionId.setText(formFields.getProperty("transactionId"));
		transactionType.setText(formFields.getProperty("transactionType"));
	}

	private void followUpVoid() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty("transactionID", "28790224");
		formFields.setProperty("transactionType", "Settlement");
	}
}

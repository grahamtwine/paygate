package za.co.payhost.ui.payhost.followup;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;
import za.co.payhost.ui.payhost.PayHostWindow;

public class FollowUpRefund extends PayHostWindow {
	private static final long serialVersionUID = 9095517183135107246L;

	private JTextField payGateId;
	private JTextField password;
	private JTextField transactionId;
	private JTextField amount;

	public FollowUpRefund() {
		super("Follow up Refund", "RefundRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);

		transactionId = createTextField(UIUtils.TRANSACTION_ID);
		amount = createTextField(UIUtils.AMOUNT);

		addMenuItem("PayGate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);

		addMenuItem("Transaction ID", transactionId);
		addMenuItem(UIUtils.AMOUNT, amount);
	}

	@Override
	protected void resetFormToDefaultValues() {
		followUpRefund();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		transactionId.setText(formFields.getProperty("transactionId"));
		amount.setText(formFields.getProperty(UIUtils.AMOUNT));
	}

	private void followUpRefund() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty("transactionID", "28790224");
		formFields.setProperty(UIUtils.AMOUNT, "100");
	}
}

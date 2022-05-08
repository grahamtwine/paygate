package za.co.payhost.ui.payhost.vault;

import javax.swing.JTextField;

import za.co.payhost.ui.UIUtils;
import za.co.payhost.ui.payhost.PayHostWindow;

public class CardVault extends PayHostWindow {
	private static final long serialVersionUID = -2431309120813221375L;

	private JTextField payGateId;
	private JTextField password;
	private JTextField cardNumber;
	private JTextField cardExpiryDate;
	
	public CardVault() {
		super("Card", "");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);
		cardNumber = createTextField(UIUtils.CARD_NUMBER);
		cardExpiryDate = createTextField(UIUtils.CARD_EXPIRY_DATE);

		addMenuItem("Pay Gate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);
		addMenuItem("Card Number", cardNumber);
		addMenuItem("Card Expiry Date", cardExpiryDate);
	}

	@Override
	protected void resetFormToDefaultValues() {
		singleVaultCard();
		
		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		cardNumber.setText(formFields.getProperty(UIUtils.CARD_NUMBER));
		cardExpiryDate.setText(formFields.getProperty(UIUtils.CARD_EXPIRY_DATE));
	}

	private void singleVaultCard() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty(UIUtils.CARD_NUMBER, "5200000000000015");
		formFields.setProperty(UIUtils.CARD_EXPIRY_DATE, "112030");
	}
}

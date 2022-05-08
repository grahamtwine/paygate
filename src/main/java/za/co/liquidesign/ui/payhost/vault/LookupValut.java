package za.co.liquidesign.ui.payhost.vault;

import javax.swing.JTextField;

import za.co.liquidesign.ui.UIUtils;
import za.co.liquidesign.ui.payhost.PayHostWindow;

public class LookupValut extends PayHostWindow {
	private static final long serialVersionUID = 1L;

	private JTextField password;
	private JTextField payGateId;
	private JTextField vaultId;

	public LookupValut() {
		super("Lookup Valut", "LookUpVaultRequest", "SingleVaultRequest");
	}

	@Override
	protected void createMenu() {
		payGateId = createTextField(UIUtils.PAYGATEID);
		password = createTextField(UIUtils.PASSWORD);
		vaultId = createTextField(UIUtils.VAULTID);

		addMenuItem("Pay Gate ID", payGateId);
		addMenuItem(UIUtils.PASSWORD, password);
		addMenuItem("Vault ID", vaultId);
	}

	@Override
	protected void resetFormToDefaultValues() {
		lookupVault();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		vaultId.setText(formFields.getProperty("vaultID"));
	}

	private void lookupVault() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011064270");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty("vaultID", "c36a13e8-65a0-49fd-a12f-05fe78bf9eaa");
	}
}

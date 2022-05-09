package za.co.liquidesign.ui.payhost.vault;

import javax.swing.JTextField;

import za.co.liquidesign.ui.UIUtils;
import za.co.liquidesign.ui.payhost.PayHostWindow;

public class DeleteVault extends PayHostWindow {
	private static final long serialVersionUID = 3462313988593954960L;

	private JTextField payGateId;
	private JTextField password;
	private JTextField vaultId;

	public DeleteVault() {
		super("Delete", "DeleteVaultRequest", "SingleVaultRequest");
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
		deleteVault();

		payGateId.setText(formFields.getProperty(UIUtils.PAYGATEID));
		password.setText(formFields.getProperty(UIUtils.PASSWORD));
		vaultId.setText(formFields.getProperty(UIUtils.VAULTID));
	}

	private void deleteVault() {
		formFields.setProperty(UIUtils.PAYGATEID, "10011072130");
		formFields.setProperty(UIUtils.PASSWORD, "test");
		formFields.setProperty(UIUtils.VAULTID, "5c633bfa-5359-482e-b144-2949aa332c74");
	}
}

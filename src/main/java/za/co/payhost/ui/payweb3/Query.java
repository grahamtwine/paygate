package za.co.payhost.ui.payweb3;

import javax.swing.JLabel;
import javax.swing.JTextField;

import za.co.payhost.ui.Mockups;
import za.co.payhost.ui.PayHostWindow;
import za.co.payhost.ui.UIUtils;

/**
 *
 * @author App Inlet (Pty) Ltd
 */
public class Query extends PayHostWindow {
	private static final long serialVersionUID = -511034254785983399L;

	
	public Query() {
		super(UIUtils.PAYWEB3_QUERY, UIUtils.PAYWEB3_QUERY_ENDPOINT);
	}
	
	
	@Override
	protected void createMenu() {
		
		JLabel lblPaygateId = createLabel("Pay Gate ID");
		payGateIDField = createTextField(UIUtils.PAYGATE_ID);
		
		JLabel lblChecksum = createLabel("Checksum");
		checksumField = createTextField(UIUtils.CHECKSUM);


		JLabel lblPayRequestId = createLabel("PAY REQUEST ID");
		payRequestIDField = createTextField(UIUtils.PAY_REQUEST_ID);
		
		JLabel lblReference = createLabel("Reference");
		referenceField = createTextField(UIUtils.REFERENCE);
		
		addMenuItem(lblPaygateId,payGateIDField);
		addMenuItem(lblReference,referenceField);
		addMenuItem(lblChecksum,checksumField);
		addMenuItem(lblPayRequestId,payRequestIDField);
	}

	
	@Override
	protected void resetFormToDefaultValues() {
		formData = Mockups.paywebQuery();
		
		payGateIDField.setText(formData.getProperty(UIUtils.PAYGATE_ID));
		referenceField.setText(formData.getProperty(UIUtils.REFERENCE));
		payRequestIDField.setText(formData.getProperty(UIUtils.PAY_REQUEST_ID));
		checksumField.setText(formData.getProperty(UIUtils.CHECKSUM));
		
		requestArea.setText(payWeb.toString(formData));
	}
	
	
	private JTextField payGateIDField;
	private JTextField referenceField;
	private JTextField checksumField;
	private JTextField payRequestIDField;
}

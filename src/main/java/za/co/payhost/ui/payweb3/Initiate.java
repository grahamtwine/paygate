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
public class Initiate extends PayHostWindow {	
	private static final long serialVersionUID = -5292377015097939903L;
	
	
	public Initiate() {
		super(UIUtils.PAYWEB3_INITIATE, UIUtils.PAYWEB3_INITIATE_ENDPOINT);
	}
	
	
	@Override
    protected void createMenu() {
        JLabel lblPayGateId = createLabel("Pay Gate ID");
        txtPayGateId = createTextField(UIUtils.PAYGATE_ID);
        
        JLabel lblReference = createLabel("Reference");
        txtReference = createTextField(UIUtils.REFERENCE);
        
        JLabel lblLocale = createLabel("Locale");
        txtLocale = createTextField(UIUtils.LOCALE);
        
        JLabel lblChecksum = createLabel("Checksum");
        txtChecksum = createTextField(UIUtils.CHECKSUM);
        
        JLabel lblEmail = createLabel("Email");
        txtEmail = createTextField(UIUtils.EMAIL);
        
        JLabel lblNotifyUrl = createLabel("Notify Url");
        txtNotifyUrl = createTextField(UIUtils.NOTIFY_URL);
        
        JLabel lblReturnUrl = createLabel("Return Url");
        txtReturnUrl = createTextField(UIUtils.RETURN_URL);
        
        JLabel lblCurrency = createLabel("Currency");
        txtCurrency = createTextField(UIUtils.CURRENCY);

        JLabel lblAmount = createLabel("Amount");
        txtAmount = createTextField(UIUtils.AMOUNT);

        JLabel lblTransactionDate = createLabel("Transaction Date");
        txtTransactionDate = createTextField(UIUtils.TRANSACTION_DATE);

        JLabel tbtCountry = createLabel("Country");
        txtCountry = createTextField(UIUtils.COUNTRY);
        
        addMenuItem(lblPayGateId,txtPayGateId);
        addMenuItem(lblReference,txtReference);
        addMenuItem(lblLocale,txtLocale);
        addMenuItem(lblChecksum,txtChecksum);
        addMenuItem(lblEmail,txtEmail);
        addMenuItem(lblNotifyUrl,txtNotifyUrl);
        addMenuItem(lblReturnUrl,txtReturnUrl);
        addMenuItem(lblCurrency,txtCurrency);
        addMenuItem(lblAmount,txtAmount);
        addMenuItem(lblTransactionDate,txtTransactionDate);
        addMenuItem(tbtCountry,txtCountry);
    }
    
	
	@Override
    protected void resetFormToDefaultValues() {
    	formData = Mockups.paywebInitiate();
    	
        txtPayGateId.setText(formData.getProperty(UIUtils.PAYGATE_ID));
        txtReference.setText(formData.getProperty(UIUtils.REFERENCE));
        txtTransactionDate.setText(formData.getProperty(UIUtils.TRANSACTION_DATE));
        txtLocale.setText(formData.getProperty(UIUtils.LOCALE));
        txtChecksum.setText(formData.getProperty(UIUtils.CHECKSUM));
        txtEmail.setText(formData.getProperty(UIUtils.EMAIL));
        txtNotifyUrl.setText(formData.getProperty(UIUtils.NOTIFY_URL));
        txtReturnUrl.setText(formData.getProperty(UIUtils.RETURN_URL));
        txtCurrency.setText(formData.getProperty(UIUtils.CURRENCY));
        txtAmount.setText(formData.getProperty(UIUtils.AMOUNT));
        txtCountry.setText(formData.getProperty(UIUtils.COUNTRY));
        
        requestArea.setText(payWeb.toString(formData));
    }
    
	
	private JTextField txtPayGateId;
	private JTextField txtReference;
	private JTextField txtLocale;
	private JTextField txtChecksum;
	private JTextField txtEmail;
	private JTextField txtNotifyUrl;
	private JTextField txtReturnUrl;
	private JTextField txtCurrency;
	private JTextField txtAmount;
	private JTextField txtTransactionDate;
	private JTextField txtCountry;
}

package za.co.liquidesign.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public final class UIUtils {
	public static final Border LOWERED_ETCHED_BORDER = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

	public static final Color HEADING_COLOUR = new Color(0, 51, 153);

	public static final String FONT_STYLE = "Tahoma";

	public static final Font HEADING_MAIN = new Font(FONT_STYLE, 0, 20);

	public static final Font LBL_FONT = new Font(FONT_STYLE, 0, 14);

	public static final Font TXTFIELD_FONT = new Font(FONT_STYLE, 0, 12);
	public static final Color TXTFIELD_FONT_COLOUR = new Color(0, 0, 153);

	public static final Font BTN_FONT = new Font(FONT_STYLE, 1, 14);
	public static final Color COLOUR_WHITE = new Color(255, 255, 255);
	public static final Color BTN_BG_COLOUR = new Color(0, 0, 255);

	public static final String PAYGATE_HOST = "https://secure.paygate.co.za";

	public static final String PAYWEB3_INITIATE_ENDPOINT = PAYGATE_HOST + "/payweb3/initiate.trans";
	public static final String PAYWEB3_REDIRECT_ENDPOINT = PAYGATE_HOST + "/payweb3/process.trans";
	public static final String PAYWEB3_QUERY_ENDPOINT = PAYGATE_HOST + "/payweb3/query.trans";

	public static final String PAYHOST_ENDPOINT = PAYGATE_HOST + "/payhost/process.trans";
	public static final String PAYHOST_WSDL = PAYHOST_ENDPOINT + "?wsdl";

	public static final String PAY_WEB3 = "PayWeb3";
	public static final String PAYWEB3_INITIATE = "Initiate";
	public static final String PAYWEB3_PROCESS = "Process";
	public static final String PAYWEB3_QUERY = "Query";

	public static final String WEB_PAY_QUERY = "Web Pay Query";
	public static final String CARD_PAYMENT = "Card Payment";
	public static final String TOKEN_PAYMENT = "Token Payment";
	public static final String WEB_PAYMENT = "Web Payment";
	public static final String SINGLE_PAYOUT = "Single Payout";
	public static final String VOID = "Void";
	public static final String SETTLEMENT = "Settlement";
	public static final String REFUND = "Refund";

	public static final String VAULT_CARD = "Vault Card";
	public static final String VAULT_LOOKUP = "Vault Lookup";
	public static final String VAULT_DELETE = "Vault Delete";
	public static final String FOLLOW_UP_QUERY = "Query";

	public static final Dimension WINDOW_SIZE = new Dimension(1100, 400);
	public static final Dimension BUTTON_SIZE = new Dimension(150, 70);

	public static final String PAYGATE_ID = "PAYGATE_ID";
	public static final String PAYGATEID = "PayGateId";
	public static final String PASSWORD = "Password";

	public static final String PAYREQUESTID = "PayRequestId";
	public static final String PAY_REQUEST_ID = "PAY_REQUEST_ID";
	public static final String REFERENCE = "Reference";
	public static final String RETURN_URL = "RETURN_URL";
	public static final String NOTIFY_URL = "NOTIFY_URL";
	public static final String LOCALE = "Locale";
	public static final String CHECKSUM = "Checksum";

	public static final String VAULTID = "VaultId";

	public static final String TOKEN = "Token";
	public static final String TOKEN_DETAIL = "TokenDetail";

	public static final String CARD_NUMBER = "CardNumber";
	public static final String CARD_EXPIRY_DATE = "CardExpiryDate";
	public static final String CVV_NUMBER = "CVV";
	public static final String BUDGET_PERIOD = "BudgetPeriod";

	public static final String TITLE = "Title";
	public static final String FIRST_NAME = "FirstName";
	public static final String LAST_NAME = "LastName";
	public static final String TELEPHONE_NUMBER = "Telephone";
	public static final String MOBILE_NUMBER = "Mobile";
	public static final String EMAIL = "Email";

	public static final String MERCHANT_ORDER_ID = "MerchantOrderId";
	public static final String TRANSACTION_ID = "TransactionId";
	public static final String TRANSACTION_TYPE = "TransactionType";
	public static final String TRANSACTIONDATE = "TransactionDate";
	public static final String TRANSACTION_DATE = "Transaction_Date";
	public static final String COUNTRY = "Country";
	public static final String CURRENCY = "Currency";
	public static final String AMOUNT = "Amount";

	private UIUtils() {
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Permission denied while cloning UIUtils.class");
	}
}

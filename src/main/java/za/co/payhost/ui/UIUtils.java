package za.co.payhost.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


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
	
	static final Dimension TXTFIELD_DIMENSION = new Dimension(350, 25);

	public static final String PAY_WEB3 = "PayWeb3";
	public static final String PAYWEB3_INITIATE = "Initiate";
	public static final String PAYWEB3_QUERY = "Query";

	public static final String PAYWEB3_QUERY_ENDPOINT    = "https://secure.paygate.co.za/payweb3/query.trans";
	public static final String PAYWEB3_INITIATE_ENDPOINT = "https://secure.paygate.co.za/payweb3/initiate.trans";
	public static final String PAYGATE_ID       = "PAYGATE_ID";
	public static final String REFERENCE        = "REFERENCE";
	public static final String AMOUNT           = "AMOUNT";
	public static final String CURRENCY         = "CURRENCY";
	public static final String RETURN_URL       = "RETURN_URL";
	public static final String TRANSACTION_DATE = "TRANSACTION_DATE";
	public static final String LOCALE           = "LOCALE";
	public static final String NOTIFY_URL       = "NOTIFY_URL";
	public static final String COUNTRY          = "COUNTRY";
	public static final String EMAIL            = "EMAIL";
	public static final String CHECKSUM         = "CHECKSUM";
	public static final String PAY_REQUEST_ID   = "PAY_REQUEST_ID";
	
	
	private UIUtils() {	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Permission denied while cloning UIUtils.class");
	}
}

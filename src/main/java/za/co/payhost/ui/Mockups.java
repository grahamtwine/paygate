package za.co.payhost.ui;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public final class Mockups {

	/**
	 * Generic Properties FormFields Maker for all requests
	 *
	 * @return FormFields
	 */
	public static final FormFields common() {
		FormFields object = new FormFields();
		object.setProperty(UIUtils.PAYGATEID, "10011064270");
		object.setProperty("payRequestID", "6B739421-C177-903F-B23A-4BC1F09AB791");
		object.setProperty("TransactionID", "5");
		object.setProperty("transactionType", "Settlement");
		object.setProperty(UIUtils.TRANSACTIONDATE, "Settlement");
		object.setProperty(UIUtils.MERCHANT_ORDER_ID, "order-1234");
		object.setProperty(UIUtils.PASSWORD, "test");
		object.setProperty(UIUtils.FIRST_NAME, "Joe");
		object.setProperty(UIUtils.LAST_NAME, "Soap");
		object.setProperty("phone", "0861234567");
		object.setProperty("mobile", "0735552233");
		object.setProperty(UIUtils.NOTIFY_URL, "https://www.mytestsite.com/notify");
		object.setProperty(UIUtils.RETURN_URL, "https://www.mytestsite.com/return");
		object.setProperty("budgetPeriod", "0");
		object.setProperty("cvv", "999");
		object.setProperty(UIUtils.EMAIL, "joes@example.com");
		object.setProperty(UIUtils.CARD_NUMBER, "5200000000000015");
		object.setProperty(UIUtils.CARD_EXPIRY_DATE, "112030");
		object.setProperty(UIUtils.MERCHANT_ORDER_ID, "order-1234");
		object.setProperty(UIUtils.CURRENCY, "ZAR");
		object.setProperty(UIUtils.AMOUNT, "100");
		object.setProperty("vaultID", "c36a13e8-65a0-49fd-a12f-05fe78bf9eaa");
		return object;
	}

	private Mockups() {
	}
}

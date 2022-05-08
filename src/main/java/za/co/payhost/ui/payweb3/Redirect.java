package za.co.payhost.ui.payweb3;

import za.co.payhost.ui.UIUtils;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public class Redirect extends PayWeb3Window {
	private static final long serialVersionUID = -6949364821909963537L;

	protected Redirect() {
		super(UIUtils.PAYWEB3_PROCESS, UIUtils.PAYWEB3_REDIRECT_ENDPOINT);
	}

	@Override
	protected void createMenu() {
		// TODO document why this method is empty
	}

	@Override
	protected void resetFormToDefaultValues() {
		// TODO document why this method is empty
	}

}

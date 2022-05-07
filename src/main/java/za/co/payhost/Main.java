package za.co.payhost;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import za.co.payhost.ui.UIUtils;
import za.co.payhost.ui.payhost.singlefollowup.SingleFollowUpTestQuery;
import za.co.payhost.ui.payhost.singlefollowup.SingleFollowUpTestRefund;
import za.co.payhost.ui.payhost.singlefollowup.SingleFollowUpTestSettlement;
import za.co.payhost.ui.payhost.singlefollowup.SingleFollowUpTestVoid;
import za.co.payhost.ui.payhost.singlepayment.CardPaymentTest;
import za.co.payhost.ui.payhost.singlepayment.TokenPaymentTest;
import za.co.payhost.ui.payhost.singlepayment.WebPaymentTest;
import za.co.payhost.ui.payhost.singlepayout.SinglePayoutTest;
import za.co.payhost.ui.payhost.vault.VaultTestCard;
import za.co.payhost.ui.payhost.vault.VaultTestDelete;
import za.co.payhost.ui.payhost.vault.VaultTestLookup;
import za.co.payhost.ui.payweb3.Initiate;
import za.co.payhost.ui.payweb3.Query;

/**
 *
 * @author App Inlet (Pty) Ltd
 */
public class Main extends JFrame {
	private static final long serialVersionUID = -2598793367353803692L;
	private static final Logger LOG = Logger.getLogger("Main");

	private static final String WEB_PAY_QUERY = "Web Pay Query";
	private static final String CARD_PAYMENT = "Card Payment";
	private static final String TOKEN_PAYMENT = "Token Payment";
	private static final String WEB_PAYMENT = "Web Payment";
	private static final String SINGLE_PAYOUT = "Single Payout";
	private static final String VOID = "Void";
	private static final String SETTLEMENT = "Settlement";
	private static final String REFUND = "Refund";

	private static final String VAULT_CARD = "Vault Card";
	private static final String VAULT_LOOKUP = "Vault Lookup";
	private static final String VAULT_DELETE = "Vault Delete";
	private static final String FOLLOW_UP_QUERY = "Query";

	private static final Dimension WINDOW_SIZE = new Dimension(1100, 400);
	private static final Dimension BUTTON_SIZE = new Dimension(150, 70);

	
	public Main() {
		initComponents();
		setMinimumSize(WINDOW_SIZE);
		setPreferredSize(WINDOW_SIZE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	
	
	private void btnClickedEvent(ActionEvent evt) {
		String command = evt.getActionCommand();

		if (WEB_PAY_QUERY.equals(command)) {
			new Query();

		} else if (UIUtils.PAYWEB3_INITIATE.equals(command)) {
			new Initiate();

		} else if (VAULT_DELETE.equals(command)) {
			new VaultTestDelete();

		} else if (VAULT_LOOKUP.equals(command)) {
			new VaultTestLookup();

		} else if (FOLLOW_UP_QUERY.equals(command)) {
			new SingleFollowUpTestQuery();

		} else if (REFUND.equals(command)) {
			new SingleFollowUpTestRefund();

		} else if (SETTLEMENT.equals(command)) {
			new SingleFollowUpTestSettlement();

		} else if (VOID.equals(command)) {
			new SingleFollowUpTestVoid();

		} else if (SINGLE_PAYOUT.equals(command)) {
			new SinglePayoutTest();

		} else if (WEB_PAYMENT.equals(command)) {
			new WebPaymentTest();

		} else if (TOKEN_PAYMENT.equals(command)) {
			new TokenPaymentTest();

		} else if (CARD_PAYMENT.equals(command)) {
			new CardPaymentTest();

		} else if (VAULT_CARD.equals(command)) {
			new VaultTestCard();
		}
	}
	
	
	private void initComponents() {

		JPanel root = new JPanel();
		root.setLayout(new GridLayout(1, 2, 3, 3));
		root.add(createPayWeb3Panel());
		root.add(createPayHostPanel());

		getContentPane().setLayout(new CardLayout(20, 20));
		getContentPane().add(root);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBackground(new Color(51, 204, 0));
	}
	
	
	private JPanel createPayWeb3Panel() {
		JButton initiateBtn = createButton(UIUtils.PAYWEB3_INITIATE);
		JButton queryBtn = createButton(WEB_PAY_QUERY);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 2, 26, 3));
		p.add(initiateBtn);
		p.add(queryBtn);

		TitledBorder title = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, UIUtils.PAY_WEB3);
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleFont(UIUtils.HEADING_MAIN);

		JPanel payWeb3 = new JPanel();
		payWeb3.setLayout(new CardLayout(10, 10));
		payWeb3.setBorder(title);
		payWeb3.add(p);

		return payWeb3;
	}
	
	
	private JPanel createPayHostPanel() {
		JButton singlePayoutBtn = createButton(SINGLE_PAYOUT);

		JButton webPaymentBtn = createButton(WEB_PAYMENT);
		JButton tokenPaymentBtn = createButton(TOKEN_PAYMENT);
		JButton cardPaymentBtn = createButton(CARD_PAYMENT);

		JButton vaultCardBtn = createButton(VAULT_CARD);
		JButton vaultDeleteBtn = createButton(VAULT_DELETE);
		JButton vaultLookupBtn = createButton(VAULT_LOOKUP);

		JButton payHostQueryBtn = createButton(FOLLOW_UP_QUERY);
		JButton refundBtn = createButton(REFUND);
		JButton settlementBtn = createButton(SETTLEMENT);
		JButton voidBtn = createButton(VOID);

		JPanel singlePayoutOperations = new JPanel();
		singlePayoutOperations.setLayout(new GridLayout(1, 4, 6, 3));
		singlePayoutOperations.add(singlePayoutBtn);

		TitledBorder singlePayoutTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, SINGLE_PAYOUT);
		singlePayoutTitle.setTitleJustification(TitledBorder.LEFT);
		singlePayoutTitle.setTitleFont(UIUtils.LBL_FONT);

		JPanel singlePayoutPnl = new JPanel();
		singlePayoutPnl.setLayout(new CardLayout(6, 3));
		singlePayoutPnl.setBorder(singlePayoutTitle);
		singlePayoutPnl.add(singlePayoutOperations, BorderLayout.CENTER);

		JPanel singlePaymentOperations = new JPanel();
		singlePaymentOperations.setLayout(new GridLayout(1, 4, 6, 3));
		singlePaymentOperations.add(webPaymentBtn);
		singlePaymentOperations.add(tokenPaymentBtn);
		singlePaymentOperations.add(cardPaymentBtn);

		TitledBorder singlePaymentTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, "Single Payment");
		singlePaymentTitle.setTitleJustification(TitledBorder.LEFT);
		singlePaymentTitle.setTitleFont(UIUtils.LBL_FONT);

		JPanel singlePaymentPnl = new JPanel();
		singlePaymentPnl.setLayout(new CardLayout(6, 3));
		singlePaymentPnl.setBorder(singlePaymentTitle);
		singlePaymentPnl.add(singlePaymentOperations);

		JPanel vaultOperations = new JPanel();
		vaultOperations.setLayout(new GridLayout(1, 4, 6, 3));
		vaultOperations.add(vaultCardBtn);
		vaultOperations.add(vaultLookupBtn);
		vaultOperations.add(vaultDeleteBtn);

		TitledBorder vaultTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, "Vault");
		vaultTitle.setTitleJustification(TitledBorder.LEFT);
		vaultTitle.setTitleFont(UIUtils.LBL_FONT);

		JPanel vaultPnl = new JPanel();
		vaultPnl.setLayout(new CardLayout(6, 3));
		vaultPnl.setBorder(vaultTitle);
		vaultPnl.add(vaultOperations, BorderLayout.CENTER);

		JPanel singleFollowupOperations = new JPanel();
		singleFollowupOperations.setLayout(new GridLayout(1, 4, 6, 3));
		singleFollowupOperations.add(payHostQueryBtn);
		singleFollowupOperations.add(refundBtn);
		singleFollowupOperations.add(settlementBtn);
		singleFollowupOperations.add(voidBtn);

		TitledBorder singleFollowUpTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, "Single Follow Up");
		singleFollowUpTitle.setTitleJustification(TitledBorder.LEFT);
		singleFollowUpTitle.setTitleFont(UIUtils.LBL_FONT);

		JPanel singleFollowupPnl = new JPanel();
		singleFollowupPnl.setLayout(new CardLayout(6, 3));
		singleFollowupPnl.setBorder(singleFollowUpTitle);
		singleFollowupPnl.add(singleFollowupOperations, BorderLayout.CENTER);

		JPanel rPnlBtns = new JPanel();
		rPnlBtns.setLayout(new GridLayout(4, 1));
		rPnlBtns.add(singlePayoutPnl);
		rPnlBtns.add(singlePaymentPnl);
		rPnlBtns.add(vaultPnl);
		rPnlBtns.add(singleFollowupPnl);

		TitledBorder title = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, "Pay Host");
		title.setTitleJustification(TitledBorder.CENTER);
		title.setTitleFont(UIUtils.HEADING_MAIN);

		JPanel payHost = new JPanel();
		payHost.setLayout(new CardLayout(10, 10));
		payHost.setBorder(title);
		payHost.add(rPnlBtns);

		return payHost;
	}
	
	private JButton createButton(String label) {

		JButton b = new JButton();
		 
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		b.setBorder(compound);
		b.setPreferredSize(BUTTON_SIZE);
		b.setSize(BUTTON_SIZE);
		b.setMaximumSize(BUTTON_SIZE);
		b.setMinimumSize(BUTTON_SIZE);
		b.setBackground(UIUtils.BTN_BG_COLOUR);
		b.setFont(UIUtils.BTN_FONT);
		b.setForeground(UIUtils.COLOUR_WHITE);
		b.setText(label);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnClickedEvent(evt);
			}
		});

		return b;
	}

	public static void main(String[] args) {
		System.setProperty("awt.useSystemAAFontSettings", "on");
		System.setProperty("swing.aatext", "true");
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		} catch ( ClassNotFoundException
				| InstantiationException
				| IllegalAccessException
				| UnsupportedLookAndFeelException ex ) {
			LOG.log(Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}
}

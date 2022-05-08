package za.co.liquidesign.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
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

import za.co.liquidesign.ui.payhost.followup.FollowUpQuery;
import za.co.liquidesign.ui.payhost.followup.FollowUpRefund;
import za.co.liquidesign.ui.payhost.followup.FollowUpSettlement;
import za.co.liquidesign.ui.payhost.followup.FollowUpVoid;
import za.co.liquidesign.ui.payhost.payment.CardPayment;
import za.co.liquidesign.ui.payhost.payment.TokenPayment;
import za.co.liquidesign.ui.payhost.payment.WebPayment;
import za.co.liquidesign.ui.payhost.singlepayout.SinglePayout;
import za.co.liquidesign.ui.payhost.vault.CardVault;
import za.co.liquidesign.ui.payhost.vault.DeleteVault;
import za.co.liquidesign.ui.payhost.vault.LookupValut;
import za.co.liquidesign.ui.payweb3.Initiate;
import za.co.liquidesign.ui.payweb3.Query;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public class Main extends JFrame {
	private static final long serialVersionUID = -2598793367353803692L;

	static final Logger LOG = Logger.getLogger("Main");

	public Main() {
		initComponents();
		setMinimumSize(UIUtils.WINDOW_SIZE);
		setPreferredSize(UIUtils.WINDOW_SIZE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}

	private void btnClickedEvent(ActionEvent evt) {
		String command = evt.getActionCommand();

		if (UIUtils.WEB_PAY_QUERY.equals(command)) {
			new Query();

		} else if (UIUtils.PAYWEB3_INITIATE.equals(command)) {
			new Initiate();

		} else if (UIUtils.VAULT_DELETE.equals(command)) {
			new DeleteVault();

		} else if (UIUtils.VAULT_LOOKUP.equals(command)) {
			new LookupValut();

		} else if (UIUtils.FOLLOW_UP_QUERY.equals(command)) {
			new FollowUpQuery();

		} else if (UIUtils.REFUND.equals(command)) {
			new FollowUpRefund();

		} else if (UIUtils.SETTLEMENT.equals(command)) {
			new FollowUpSettlement();

		} else if (UIUtils.VOID.equals(command)) {
			new FollowUpVoid();

		} else if (UIUtils.SINGLE_PAYOUT.equals(command)) {
			new SinglePayout();

		} else if (UIUtils.WEB_PAYMENT.equals(command)) {
			new WebPayment();

		} else if (UIUtils.TOKEN_PAYMENT.equals(command)) {
			new TokenPayment();

		} else if (UIUtils.CARD_PAYMENT.equals(command)) {
			new CardPayment();

		} else if (UIUtils.VAULT_CARD.equals(command)) {
			new CardVault();
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
		JButton queryBtn = createButton(UIUtils.WEB_PAY_QUERY);

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
		JButton singlePayoutBtn = createButton(UIUtils.SINGLE_PAYOUT);

		JButton webPaymentBtn = createButton(UIUtils.WEB_PAYMENT);
		JButton tokenPaymentBtn = createButton(UIUtils.TOKEN_PAYMENT);
		JButton cardPaymentBtn = createButton(UIUtils.CARD_PAYMENT);

		JButton vaultCardBtn = createButton(UIUtils.VAULT_CARD);
		JButton vaultDeleteBtn = createButton(UIUtils.VAULT_DELETE);
		JButton vaultLookupBtn = createButton(UIUtils.VAULT_LOOKUP);

		JButton payHostQueryBtn = createButton(UIUtils.FOLLOW_UP_QUERY);
		JButton refundBtn = createButton(UIUtils.REFUND);
		JButton settlementBtn = createButton(UIUtils.SETTLEMENT);
		JButton voidBtn = createButton(UIUtils.VOID);

		JPanel singlePayoutOperations = new JPanel();
		singlePayoutOperations.setLayout(new GridLayout(1, 4, 6, 3));
		singlePayoutOperations.add(singlePayoutBtn);

		TitledBorder singlePayoutTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER,
				UIUtils.SINGLE_PAYOUT);
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

		TitledBorder singlePaymentTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER,
				"Single Payment");
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

		TitledBorder singleFollowUpTitle = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER,
				"Single Follow Up");
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
		b.setPreferredSize(UIUtils.BUTTON_SIZE);
		b.setSize(UIUtils.BUTTON_SIZE);
		b.setMaximumSize(UIUtils.BUTTON_SIZE);
		b.setMinimumSize(UIUtils.BUTTON_SIZE);
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

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException ex) {
			LOG.log(Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}
}

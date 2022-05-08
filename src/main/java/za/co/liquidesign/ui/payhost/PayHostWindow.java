package za.co.liquidesign.ui.payhost;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import za.co.liquidesign.services.PayHost;
import za.co.liquidesign.ui.FormFields;
import za.co.liquidesign.ui.UIUtils;

public abstract class PayHostWindow extends JFrame {
	private static final long serialVersionUID = -7684155523475746238L;
	protected static final Logger LOG = Logger.getLogger(PayHostWindow.class.getName());

	protected transient PayHost payhost = new PayHost(UIUtils.PAYHOST_ENDPOINT);
	protected transient FormFields formFields = new FormFields();

	private final JPanel menu = new JPanel();

	protected JButton btnResetForm = null;
	protected JButton btnSend = null;

	protected final JScrollPane scrollRequestArea = new JScrollPane();
	protected final JScrollPane scrollResponseArea = new JScrollPane();

	protected JTextArea requestArea;
	protected JTextArea responseArea;
	protected transient String resource = null;
	private transient String soapAction = null;

	protected PayHostWindow(String title, String resource, String soapAction) {
		this.resource = resource;
		this.soapAction = soapAction;
		
		setTitle(title);
		initCommonComponents(title);
		createMenu();
		
		
		setBackground(new Color(203, 203, 203));
		setSize(new Dimension(1300, 650));
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);
		
		resetFormToDefaultValues();
		updateRequestArea();
	}

	private void updateRequestArea() {
		requestArea.setText(envelope(resource, formFields));
	}

	private void initCommonComponents(String title) {
		JPanel body = new JPanel();

		body.setLayout(new BorderLayout(10, 10));
		body.add(createMenuContainer(title), BorderLayout.WEST);
		body.add(createRightPanel(), BorderLayout.CENTER);

		setLayout(new CardLayout(6, 6));
		getContentPane().add(body);
	}

	private JPanel createMenuContainer(String title) {
		TitledBorder menuBorder = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, title);
		menuBorder.setTitlePosition(TitledBorder.CENTER);
		menuBorder.setTitleFont(UIUtils.HEADING_MAIN);
		menuBorder.setTitleColor(UIUtils.HEADING_COLOUR);

		menu.setBorder(menuBorder);
		menu.setLayout(new GridLayout(0, 1));

		JPanel menuContainer = new JPanel();
		menuContainer.setLayout(new FlowLayout());
		menuContainer.add(menu, FlowLayout.LEFT);

		return menuContainer;
	}

	private JPanel createRightPanel() {
		JSplitPane reqResPanel = createReqResPanel();
		JPanel actionsPanel = createActionsPanel();

		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(reqResPanel, BorderLayout.CENTER);
		rightPanel.add(actionsPanel, BorderLayout.SOUTH);

		return rightPanel;
	}

	private JPanel createActionsPanel() {
		btnResetForm = createButton("Reset", "Reset the form to defaul ttest values");
		btnResetForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				resetFormToDefaultValues();
			}
		});

		btnSend = createButton("Send", "Send data to Payfast");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				sendRequest();
			}
		});

		JPanel actionsPanel = new JPanel();
		actionsPanel.setLayout(new GridLayout(1, 2));
		actionsPanel.add(btnResetForm);
		actionsPanel.add(btnSend);

		return actionsPanel;
	}

	private JSplitPane createReqResPanel() {
		requestArea = createTextArea("Request");
		scrollRequestArea.setViewportView(requestArea);

		responseArea = createTextArea("Response");
		scrollResponseArea.setViewportView(responseArea);

		JSplitPane reqResPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollRequestArea, scrollResponseArea);
		reqResPanel.setDividerSize(3);
		reqResPanel.setOneTouchExpandable(true);
		reqResPanel.setDividerLocation(150);
		
		return reqResPanel;
	}

	private JTextArea createTextArea(String title) {
		TitledBorder border = BorderFactory.createTitledBorder(UIUtils.LOWERED_ETCHED_BORDER, title, TitledBorder.RIGHT,
				TitledBorder.TOP);
		border.setTitlePosition(TitledBorder.CENTER);
		JTextArea ta = new JTextArea();
		ta.setBorder(border);
		ta.setFocusable(false);
		ta.setEditable(false);
		ta.setColumns(20);
		ta.setRows(5);
		ta.setBackground(UIUtils.COLOUR_WHITE);

		return ta;
	}

	protected JButton createButton(String title, String tooltip) {
		JButton b = new JButton(title);
		b.setBackground(UIUtils.BTN_BG_COLOUR);
		b.setFont(UIUtils.BTN_FONT);
		b.setForeground(UIUtils.COLOUR_WHITE);
		b.setToolTipText(tooltip);

		return b;
	}

	protected JTextField createTextField(String name) {
		JTextField tf = new JTextField();
		tf.setName(name);

		tf.setFont(UIUtils.TXTFIELD_FONT);
		tf.setForeground(UIUtils.TXTFIELD_FONT_COLOUR);
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent evt) {
				updateRequestField(evt);
			}
		});

		return tf;
	}

	protected JLabel createLabel(String label) {
		JLabel l = new JLabel(label);
		l.setMaximumSize(new Dimension(100, 35));
		return l;
	}

	protected void addMenuItem(String label, JTextField textField) {
		menu.add(createLabel(label));
		menu.add(textField);
	}

	private void updateRequestField(KeyEvent evt) {
		JTextField txtField = (JTextField) evt.getSource();

		LOG.log(Level.INFO, () -> ".:..::FIELD::[" + txtField.getName() + "]::..::VALUE::[" + txtField.getText() + "]");

		formFields.setProperty(txtField.getName(), txtField.getText().trim());

		updateRequestArea();
	}

	private String envelope(String fileName, FormFields formFields) {

		String data = getFileContent(fileName + ".xml");

		for (String k : formFields.getKeys()) {
			data = data.replace('{' + k + '}', formFields.getProperty(k));
		}

		return data;
	}

	private String getFileContent(String fileName) {
		try {
			ClassLoader classLoader = getClass().getClassLoader();

			URL payHostFolder = classLoader.getResource("payhost");

			File f = Files.walk(Paths.get(payHostFolder.toURI())).map(x -> x.toFile())
					.filter(y -> y.getName().equals(fileName)).findFirst().get();

			return Files.readString(f.toPath(), StandardCharsets.UTF_8);

		} catch (URISyntaxException | IOException e) {
			throw new RuntimeException("File " + fileName + " not found!", e);
		}
	}

	protected void sendRequest() {
		btnSend.setEnabled(false);

		try {
			LOG.log(Level.INFO, ".:..::Sending::..:..\n{0}\n::.::..:.::..:", formFields);

			String response = payhost.execute(soapAction, requestArea.getText());

			LOG.log(Level.INFO, ".:..::response::..:..\n{0}\n::.::..:.::..:", response);
			responseArea.setText(response);

		} catch (IOException ex) {
			responseArea.setText("\n\nAn error occured\n" + ex.getMessage());
			LOG.log(Level.SEVERE, "Request failed", ex);

		} finally {
			btnSend.setEnabled(true);
		}
	}

	protected abstract void createMenu();

	protected abstract void resetFormToDefaultValues();
}

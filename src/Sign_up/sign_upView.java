package Sign_up;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class sign_upView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tf_email;
	private JTextField tf_username;
	private JTextField tf_password;

	/**
	 * Create the panel.
	 */
	public sign_upView() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng ký");
		lblNewLabel.setBounds(600, 65, 45, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(360, 137, 45, 13);
		add(lblNewLabel_1);
		
		tf_email = new JTextField();
		tf_email.setBounds(471, 134, 395, 19);
		add(tf_email);
		tf_email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(360, 188, 67, 13);
		add(lblNewLabel_2);
		
		tf_username = new JTextField();
		tf_username.setBounds(471, 185, 395, 19);
		add(tf_username);
		tf_username.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(360, 253, 45, 13);
		add(lblNewLabel_3);
		
		tf_password = new JTextField();
		tf_password.setText("");
		tf_password.setBounds(471, 250, 395, 19);
		add(tf_password);
		tf_password.setColumns(10);
		
		JButton bt_signUp = new JButton("Đăng ký");
		bt_signUp.setBounds(610, 334, 85, 21);
		add(bt_signUp);
		
		JButton bt_exist = new JButton("Đã có tài khoản");
		bt_exist.setBounds(568, 428, 171, 21);
		add(bt_exist);

	}
}

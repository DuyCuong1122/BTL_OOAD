package Sign_in;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sign_inView extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField tf_email;
	private JTextField tf_username;
	private JTextField tf_password;
	/**
	 * Create the panel.
	 */
	public Sign_inView() {

setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setBounds(600, 65, 74, 13);
		add(lblNewLabel);
		
		
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
		
		JButton bt_signIn = new JButton("Đăng nhập");
		bt_signIn.setBounds(610, 334, 85, 21);
		add(bt_signIn);
		
		JButton bt_create = new JButton("Tạo tài khoản");
		bt_create.setBounds(568, 428, 171, 21);
		add(bt_create);

	}

}

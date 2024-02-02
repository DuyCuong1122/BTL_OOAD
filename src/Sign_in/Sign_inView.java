package Sign_in;

import homepage_user.HomepageController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		lblNewLabel_3.setBounds(360, 253, 60, 13);
		add(lblNewLabel_3);
		
		tf_password = new JTextField();
		tf_password.setText("");
		tf_password.setBounds(471, 250, 395, 19);
		add(tf_password);
		tf_password.setColumns(10);
		
		JButton bt_signIn = new JButton("Đăng nhập");
		bt_signIn.setBounds(610, 334, 150, 21);
		add(bt_signIn);
		
		JButton bt_create = new JButton("Tạo tài khoản");
		bt_create.setBounds(568, 428, 171, 21);
		add(bt_create);
		bt_create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomepageController.getInstance().showSignUpView();
			}
		});
		bt_signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int validAcc = 0;
				String role;
				String id;
				Sign_inController.setUser(tf_username.getText());
				Sign_inController.setPass(tf_password.getText());
				validAcc = Sign_inController.checkAcc();
				role = Sign_inController.getRole();
				id = Sign_inController.getID();
				if (validAcc == 1 && role.equals("volunteer")){
					HomepageController.getInstance().setID(id);
					HomepageController.getInstance().showHomepage();
				}
				else {
					JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
				}
			}
		});

	}

}

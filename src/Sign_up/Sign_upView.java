package Sign_up;

import javax.swing.*;

import homepage_user.HomepageController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sign_upView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tf_email;
	private JTextField tf_username;
	private JTextField tf_password;
	private JTextField ten;
	private JTextField ngaySinh;
	private JTextField sdt;
	private JTextField diachi;
	private JTextField cccd;
	/**
	 * Create the panel.
	 */
	public Sign_upView() {
		setLayout(null);
		JLabel lblNewLabel = new JLabel("Đăng ký");
		lblNewLabel.setBounds(600, 50, 150, 20);
		add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Tên");
		lblNewLabel_2.setBounds(360, 95, 150, 20);
		add(lblNewLabel_2);

		ten = new JTextField();
		ten.setBounds(500, 95, 400, 20);
		add(ten);
		ten.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Ngày sinh");
		lblNewLabel_3.setBounds(360, 160, 150, 20);
		add(lblNewLabel_3);

		ngaySinh = new JTextField();
		ngaySinh.setBounds(500, 160, 400, 20);
		add(ngaySinh);
		ngaySinh.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("SĐT");
		lblNewLabel_4.setBounds(360, 225, 150, 20);
		add(lblNewLabel_4);

		sdt = new JTextField();
		sdt.setBounds(500, 225, 400, 20);
		add(sdt);
		sdt.setColumns(10);

		JLabel lblNewLabel_5= new JLabel("Địa chỉ");
		lblNewLabel_5.setBounds(360, 290, 150, 20);
		add(lblNewLabel_5);

		diachi = new JTextField();
		diachi.setBounds(500, 290, 400, 20);
		add(diachi);
		diachi.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("CCCD");
		lblNewLabel_6.setBounds(360, 355, 150, 20);
		add(lblNewLabel_6);

		cccd = new JTextField();
		cccd.setBounds(500, 355, 400, 20);
		add(cccd);
		cccd.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Username");
		lblNewLabel_7.setBounds(360, 420, 67, 20);
		add(lblNewLabel_7);

		tf_username = new JTextField();
		tf_username.setBounds(500, 420, 400, 20);
		add(tf_username);
		tf_username.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Password");
		lblNewLabel_8.setBounds(360, 485, 150, 20);
		add(lblNewLabel_8);

		tf_password = new JTextField();
		tf_password.setText("");
		tf_password.setBounds(500, 485, 395, 20);
		add(tf_password);
		tf_password.setColumns(10);
		
		JButton bt_signUp = new JButton("Đăng ký");
		bt_signUp.setBounds(610, 525, 85, 21);
		bt_signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sign_upController.setTen(ten.getText());
				Sign_upController.setNgaySinh(ngaySinh.getText());
				Sign_upController.setSdt(sdt.getText());
				Sign_upController.setDiachi(diachi.getText());
				Sign_upController.setCccd(cccd.getText());
				Sign_upController.setUsername(tf_username.getText());
				Sign_upController.setPassword(tf_password.getText());
				int temp = Sign_upController.check();
				if(temp == 1){
					JOptionPane.showMessageDialog(null, "Đăng ký thành công");
				}
				else {
					JOptionPane.showMessageDialog(null, "Đăng ký thất bại");
				}
			}
		});
		add(bt_signUp);
		JButton bt_exist = new JButton("Đã có tài khoản");
		bt_exist.setBounds(568, 575, 171, 21);
		add(bt_exist);
		bt_exist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomepageController.getInstance().showSignInView();
			}
		});
	}
}

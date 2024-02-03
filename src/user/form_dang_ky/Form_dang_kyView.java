package user.form_dang_ky;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Form_dang_kyView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tA_thoiGianThamGia;

	/**
	 * Create the panel.
	 */
	public Form_dang_kyView() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Biểu mẫu đăng ký hiến máu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(500, 5, 408, 109);
		add(lblNewLabel);

		hoVaTen();
		event();
		eventTime();
		diaDiem();
		joinTime();
		luongMauHien();
		button_dangKy();

	}

	public void hoVaTen() {
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(400, 150, 118, 26);
		add(lblNewLabel_1);

		JLabel lb_ten = new JLabel("Họ và tên");
		lb_ten.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_ten.setBounds(932, 154, 118, 26);
		add(lb_ten);

	}

	public void event() {
		JLabel lblNewLabel_1_1 = new JLabel("Sự kiện tham gia");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(400, 200, 143, 26);
		add(lblNewLabel_1_1);

		JLabel lb_event = new JLabel("Họ và tên");
		lb_event.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_event.setBounds(932, 213, 118, 26);
		add(lb_event);

	}

	public void eventTime() {
		JLabel lblNewLabel_1_2 = new JLabel("Thời gian tổ chức");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(400, 250, 143, 26);
		add(lblNewLabel_1_2);

		JLabel lb_thoiGianEvent = new JLabel("Họ và tên");
		lb_thoiGianEvent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_thoiGianEvent.setBounds(932, 272, 118, 26);
		add(lb_thoiGianEvent);
	}

	public void diaDiem() {
		JLabel lblNewLabel_1_3 = new JLabel("Địa điểm tổ chức");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(400, 300, 143, 26);
		add(lblNewLabel_1_3);

		JLabel lb_diaDiem = new JLabel("Họ và tên");
		lb_diaDiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_diaDiem.setBounds(932, 331, 118, 26);
		add(lb_diaDiem);
	}

	public void joinTime() {
		JLabel lblNewLabel_1_4 = new JLabel("Thời gian tham gia");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(400, 350, 158, 26);
		add(lblNewLabel_1_4);

		tA_thoiGianThamGia = new JTextField();
		tA_thoiGianThamGia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tA_thoiGianThamGia.setBounds(932, 393, 133, 26);
		add(tA_thoiGianThamGia);
		tA_thoiGianThamGia.setColumns(10);
	}

	public void luongMauHien() {
		JLabel lblNewLabel_1_5 = new JLabel("Lượng máu hiến");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(400, 400, 143, 26);
		add(lblNewLabel_1_5);

		JComboBox cB_luongMauHien = new JComboBox();
		cB_luongMauHien.setModel(new DefaultComboBoxModel(new String[] { "200cc", "300cc" }));
		cB_luongMauHien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cB_luongMauHien.setBounds(932, 460, 133, 26);
		add(cB_luongMauHien);
	}

	public void button_dangKy() {
		JButton bt_dangKy = new JButton("Đăng ký");
		bt_dangKy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bt_dangKy.setBounds(1015, 680, 149, 42);
		add(bt_dangKy);
		bt_dangKy.addActionListener(null);
	}
}

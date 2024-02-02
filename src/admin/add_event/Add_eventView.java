package admin.add_event;


import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import admin.homepage_admin.HomepageController;
import javax.swing.JTextArea;

public class Add_eventView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tf_event;
	private JTextField tf_diaDiem;
	private JTextField tf_thoiGian;
	private JTextArea tA_noiDung;
	public Add_eventView() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Thông tin sự kiện");
		lblNewLabel.setFont(new Font("#9Slide02 Tieu de dai", Font.BOLD, 24));
		lblNewLabel.setBounds(700, 36, 400, 32);
		add(lblNewLabel);

		logo();
		SuKien();
		NoiDung();
		DiaDiem();
		ThoiGian();
		button_return();
		button_save();
	}

	public void logo() {
		Image image;
		try {
			image = ImageIO.read(new File("F:\\Projects\\Java\\Eclipse\\Bai_tap_lon_OOP\\src\\Images\\logo.jpg"));
			Image icon = image.getScaledInstance(50, 50, Image.SCALE_DEFAULT); // scale it the smooth way
			JLabel label = new JLabel(new ImageIcon(icon));
			label.setBounds(1400, 16, 50, 50);
			add(label);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void button_return() {
		JButton btn_return = new JButton("Quay lại");
		btn_return.setFont(new Font("#9Slide01 Tieu de ngan", Font.PLAIN, 18));
		btn_return.setBounds(82, 46, 122, 25);
		btn_return.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HomepageController.getInstance().showEventPage();
			}
		});
		add(btn_return);
	}

	public void SuKien() {
		JLabel lblNewLabel_1 = new JLabel("Sự kiện");
		lblNewLabel_1.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(400, 100, 108, 29);
		add(lblNewLabel_1);

		tf_event = new JTextField();
		tf_event.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_event.setBounds(800, 100, 400, 29);
		add(tf_event);
	}

	public void NoiDung() {
		JLabel lblNewLabel_1_1 = new JLabel("Nội dung");
		lblNewLabel_1_1.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(400, 150, 108, 29);
		add(lblNewLabel_1_1);

		tA_noiDung = new JTextArea();
		tA_noiDung.setLineWrap(true);
		tA_noiDung.setBounds(800, 155, 400, 214);
		add(tA_noiDung);
	}

	public void DiaDiem() {
		JLabel lblNewLabel_1_2 = new JLabel("Địa điểm");
		lblNewLabel_1_2.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(400, 402, 139, 29);
		add(lblNewLabel_1_2);

		tf_diaDiem = new JTextField();
		tf_diaDiem.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_diaDiem.setBounds(800, 402, 400, 29);
		add(tf_diaDiem);
	}

	public void ThoiGian() {
		JLabel lblNewLabel_1_4 = new JLabel("Thời gian");
		lblNewLabel_1_4.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(400, 452, 166, 29);
		add(lblNewLabel_1_4);

		tf_thoiGian = new JTextField();
		tf_thoiGian.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_thoiGian.setBounds(800, 452, 400, 29);
		add(tf_thoiGian);
	}

	public void button_save() {
		JButton bt_save = new JButton("Lưu thay đổi");
		bt_save.setFont(new Font("#9Slide01 Tieu de ngan", Font.PLAIN, 18));
		bt_save.setBounds(1250, 750, 178, 29);
		add(bt_save);
		
		
		bt_save.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// InforController.set_Ten(tf_event.getText());
				// InforController.set_DiaDiem(tf_diaDiem.getText());
				// InforController.set_ThoiGian(tf_thoiGian.getText());
				// System.out.println(InforController.name());
				// System.out.println(InforController.DiaDiem());
				// System.out.println(InforController.ngaySinh());
				// System.out.println(InforController.nhomMau());
				// System.out.println(InforController.ThoiGian());
				// System.out.println(InforController.CCCD());
				// System.out.println(InforController.ngheNghiep());
				// System.out.println(InforController.noiCongTac());
				JOptionPane.showMessageDialog(null, "Lưu thành công");
			}
		});
	}

}

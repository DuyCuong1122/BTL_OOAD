package Change_Information;

import javax.swing.JPanel;
import homepage_user.HomepageController;
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
import Infomation.InforController;

public class Change_infoView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tf_name;
	private JTextField tf_ngaySinh;
	private JTextField tf_sdt;
	private JTextField tf_diaChi;
	private JTextField tf_CCCD;
	private JTextField tf_ngheNghiep;
	private JTextField tf_noiCongTac;
	private JTextField tf_nhomMau;

	public Change_infoView() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Thông tin cá nhân");
		lblNewLabel.setFont(new Font("#9Slide02 Tieu de dai", Font.BOLD, 24));
		lblNewLabel.setBounds(700, 36, 400, 32);
		add(lblNewLabel);

		logo();
		HoVaTen();
		birthday();
		SDT();
		diaChi();
		CCCD();
		ngheNghiep();
		noiCongTac();
		button_return();
		button_save();
		nhomMau();
	}

	public void logo() {
		Image image;
		try {
			image = ImageIO.read(new File("C:\\Users\\asus\\Desktop\\BTL_OOAD\\src\\Images\\logo.jpg"));
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
				HomepageController.getInstance().showInfoPage();
			}
		});
		add(btn_return);
	}

	public void HoVaTen() {
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(400, 100, 108, 29);
		add(lblNewLabel_1);

		tf_name = new JTextField(InforController.name());
		tf_name.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_name.setBounds(800, 100, 400, 29);
		add(tf_name);
	}

	public void birthday() {
		JLabel lblNewLabel_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_1_1.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(400, 150, 108, 29);
		add(lblNewLabel_1_1);

		tf_ngaySinh = new JTextField(InforController.ngaySinh());
		tf_ngaySinh.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_ngaySinh.setBounds(800, 150, 400, 29);
		add(tf_ngaySinh);

	}

	public void SDT() {
		JLabel lblNewLabel_1_2 = new JLabel("Số điện thoại");
		lblNewLabel_1_2.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(400, 200, 139, 29);
		add(lblNewLabel_1_2);

		tf_sdt = new JTextField(InforController.sdt());
		tf_sdt.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_sdt.setBounds(800, 200, 400, 29);
		add(tf_sdt);
	}

	public void diaChi() {
		JLabel lblNewLabel_1_4 = new JLabel("Địa chỉ thường trú");
		lblNewLabel_1_4.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(400, 250, 166, 29);
		add(lblNewLabel_1_4);

		tf_diaChi = new JTextField(InforController.diaChi());
		tf_diaChi.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_diaChi.setBounds(800, 250, 400, 29);
		add(tf_diaChi);
	}

	public void CCCD() {
		JLabel lblNewLable11 = new JLabel("CCCD");
		lblNewLable11.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLable11.setBounds(400, 300, 249, 29);
		add(lblNewLable11);

		tf_CCCD = new JTextField(InforController.CCCD());
		tf_CCCD.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_CCCD.setBounds(800, 300, 400, 29);
		add(tf_CCCD);
	}

	public void ngheNghiep() {
		JLabel lblNewLabel_1_3 = new JLabel("Nghề nghiệp");
		lblNewLabel_1_3.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(400, 350, 166, 29);
		add(lblNewLabel_1_3);

		tf_ngheNghiep = new JTextField(InforController.ngheNghiep());
		tf_ngheNghiep.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_ngheNghiep.setBounds(800, 350, 400, 29);
		add(tf_ngheNghiep);

	}

	public void button_save() {
		JButton bt_save = new JButton("Lưu thay đổi");
		bt_save.setFont(new Font("#9Slide01 Tieu de ngan", Font.PLAIN, 18));
		bt_save.setBounds(1250, 750, 178, 29);
		add(bt_save);
		bt_save.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InforController.set_Ten(tf_name.getText());
				InforController.set_sdt(tf_sdt.getText());
				InforController.set_ngaySinh(tf_ngaySinh.getText());
				InforController.set_nhomMau(tf_nhomMau.getText());
				InforController.set_diaChi(tf_diaChi.getText());
				InforController.set_CCCD(tf_CCCD.getText());
				InforController.set_ngheNghiep(tf_ngheNghiep.getText());
				InforController.set_noiCongTac(tf_noiCongTac.getText());
				System.out.println(InforController.name());
				System.out.println(InforController.sdt());
				System.out.println(InforController.ngaySinh());
				System.out.println(InforController.nhomMau());
				System.out.println(InforController.diaChi());
				System.out.println(InforController.CCCD());
				System.out.println(InforController.ngheNghiep());
				System.out.println(InforController.noiCongTac());
				JOptionPane.showMessageDialog(null, "Lưu thành công");
			}
		});
	}

	public void noiCongTac() {
		JLabel lblNewLabel_1_5 = new JLabel("Nơi công tác");
		lblNewLabel_1_5.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(400, 400, 150, 29);
		add(lblNewLabel_1_5);

		tf_noiCongTac = new JTextField(InforController.noiCongTac());
		tf_noiCongTac.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_noiCongTac.setBounds(800, 400, 400, 29);
		add(tf_noiCongTac);

		tf_ngaySinh.setColumns(10);
	}

	public void nhomMau() {
		JLabel lblNewLabel_1_6 = new JLabel("Nhóm máu");
		lblNewLabel_1_6.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_6.setBounds(400, 450, 150, 29);
		add(lblNewLabel_1_6);

		tf_nhomMau = new JTextField(InforController.nhomMau());
		tf_nhomMau.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		tf_nhomMau.setBounds(800, 450, 400, 29);
		add(tf_nhomMau);

		tf_ngaySinh.setColumns(10);
	}
}

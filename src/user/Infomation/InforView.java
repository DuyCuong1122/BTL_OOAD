package user.Infomation;

import javax.swing.JPanel;

import user.homepage_user.HomepageController;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;

public class InforView extends JPanel {

	private static final long serialVersionUID = 1L;

	public InforView() {
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
		button_change();
		nhomMau(); 
	}

	public void logo()
	{
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

	public void button_return()
	{
		JButton btn_return = new JButton("Quay lại");
		btn_return.setFont(new Font("#9Slide01 Tieu de ngan", Font.PLAIN, 18));
		btn_return.setBounds(82, 46, 122, 25);
		btn_return.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HomepageController.getInstance().showHomepage();
			}
		});
		add(btn_return);
	}

	public void HoVaTen()
	{
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(400, 100, 108, 29);
		add(lblNewLabel_1);

		JLabel lb_name = new JLabel(InforController.name());
		lb_name.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_name.setBounds(800, 100,400, 29);
		lb_name.setHorizontalAlignment(JLabel.RIGHT);
		add(lb_name);
	}

	public void birthday() {
		JLabel lblNewLabel_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_1_1.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(400, 150, 108, 29);
		add(lblNewLabel_1_1);

		JLabel lb_ngaySinh = new JLabel(InforController.ngaySinh());
		lb_ngaySinh.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_ngaySinh.setBounds(800, 150,400, 29);
		add(lb_ngaySinh);
		lb_ngaySinh.setHorizontalAlignment(JLabel.RIGHT);
	}

	public void SDT() {
		JLabel lblNewLabel_1_2 = new JLabel("Số điện thoại");
		lblNewLabel_1_2.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(400, 200, 139, 29);
		add(lblNewLabel_1_2);

		JLabel lb_sdt = new JLabel(InforController.sdt());
		lb_sdt.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_sdt.setBounds(800, 200,400, 29);
		add(lb_sdt);
		lb_sdt.setHorizontalAlignment(JLabel.RIGHT);
	}

	public void diaChi() {
		JLabel lblNewLabel_1_4 = new JLabel("Địa chỉ thường trú");
		lblNewLabel_1_4.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(400, 250, 166, 29);
		add(lblNewLabel_1_4);

		JLabel lb_diaChi = new JLabel(InforController.diaChi());
		lb_diaChi.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_diaChi.setBounds(800, 250, 400, 29);
		add(lb_diaChi);
		lb_diaChi.setHorizontalAlignment(JLabel.RIGHT);
	}

	public void CCCD() {
		JLabel lblNewLable11 = new JLabel("CCCD");
		lblNewLable11.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLable11.setBounds(400, 300, 249, 29);
		add(lblNewLable11);

		JLabel lb_CCCD = new JLabel(InforController.CCCD());
		lb_CCCD.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_CCCD.setBounds(800, 300, 400, 29);
		add(lb_CCCD);
		lb_CCCD.setHorizontalAlignment(JLabel.RIGHT);
	}

	public void ngheNghiep() {
		JLabel lblNewLabel_1_3 = new JLabel("Nghề nghiệp");
		lblNewLabel_1_3.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(400, 350, 166, 29);
		add(lblNewLabel_1_3);

		JLabel lb_ngheNghiep = new JLabel(InforController.ngheNghiep());
		lb_ngheNghiep.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_ngheNghiep.setBounds(800, 350, 400, 29);
		add(lb_ngheNghiep);
		lb_ngheNghiep.setHorizontalAlignment(JLabel.RIGHT);
	}

	public void button_change() {
		JButton bt_change = new JButton("Thay đổi hồ sơ");
		bt_change.setFont(new Font("#9Slide01 Tieu de ngan", Font.PLAIN, 18));
		bt_change.setBounds(1250, 750, 178, 29);
		bt_change.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InforController.getInstance().showChangeInfo();
			}
		});
		add(bt_change);
	}

	public void noiCongTac() {
		JLabel lblNewLabel_1_5 = new JLabel("Nơi công tác");
		lblNewLabel_1_5.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(400, 400, 150, 29);
		add(lblNewLabel_1_5);

		JLabel lb_noiCongTac = new JLabel(InforController.noiCongTac());
		lb_noiCongTac.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_noiCongTac.setBounds(800, 400, 400, 29);
		add(lb_noiCongTac);
		lb_noiCongTac.setHorizontalAlignment(JLabel.RIGHT);
	}

	public void nhomMau() {
		JLabel lblNewLabel_1_5 = new JLabel("Nhóm máu");
		lblNewLabel_1_5.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(400, 450, 150, 29);
		add(lblNewLabel_1_5);

		JLabel lb_nhomMau = new JLabel(InforController.nhomMau());
		lb_nhomMau.setFont(new Font("#9Slide01 Noi dung ngan", Font.PLAIN, 18));
		lb_nhomMau.setBounds(800, 450, 400, 29);
		add(lb_nhomMau);
		lb_nhomMau.setHorizontalAlignment(JLabel.RIGHT);
	}
}

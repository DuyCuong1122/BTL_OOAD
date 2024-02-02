package user.info_event;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import user.homepage_user.HomepageController;

public class Info_eventView extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Info_eventView() {
		setLayout(null);

		JLabel aa = new JLabel("Thông tin sự kiện");
		aa.setFont(new Font("Tahoma", Font.BOLD, 28));
		aa.setBounds(493, 5, 325, 81);
		add(aa);

		tenSuKien();
		noiDung();
		diaDiem();
		thoiGian();
		button_return();
		button_thamGia();
	}

	public void button_return() {
		JButton bt_return = new JButton("Quay lại");
		bt_return.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bt_return.setBounds(75, 31, 123, 33);
		add(bt_return);
		bt_return.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.out.println("Button 'Return' clicked");
				HomepageController.getInstance().showEventPage();
			}
		});
	}

	public void button_thamGia() {
		JButton bt_thamGia = new JButton("Tham gia");
		bt_thamGia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bt_thamGia.setBounds(1015, 531, 123, 33);
		add(bt_thamGia);
		bt_thamGia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.out.println("Button 'Tham gia' clicked");
				int choice = JOptionPane.showOptionDialog(null, "Tham gia hiến máu", "Chọn lượng máu hiến:",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "200cc", "300cc" }, "200cc");
						if (choice == JOptionPane.YES_OPTION) {
							// Người dùng chọn "Có"
							JOptionPane.showMessageDialog(null, "Chọn hiến 200cc máu thành công!");
						} else {
							// Người dùng chọn "Không" hoặc đóng cửa sổ
							JOptionPane.showMessageDialog(null, "Chọn hiến 300cc máu thành công!");
						}
			}
		});
	}

	public void tenSuKien() {
		JLabel lblNewLabel = new JLabel("Sự kiện");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(283, 130, 84, 22);
		add(lblNewLabel);

		JLabel lb_event = new JLabel("New label");
		lb_event.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_event.setBounds(538, 130, 441, 22);
		add(lb_event);
	}

	public void noiDung() {
		JLabel lblNiDung = new JLabel("Nội dung");
		lblNiDung.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNiDung.setBounds(283, 178, 84, 22);
		add(lblNiDung);
		JLabel lb_noiDung = new JLabel("New label");
		lb_noiDung.setVerticalAlignment(SwingConstants.TOP);
		lb_noiDung.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_noiDung.setBounds(538, 178, 441, 141);
		add(lb_noiDung);
	}

	public void thoiGian() {
		JLabel lblThiGian = new JLabel("Thời gian");
		lblThiGian.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThiGian.setBounds(283, 343, 84, 22);
		add(lblThiGian);

		JLabel lb_thoiGian = new JLabel("New label");
		lb_thoiGian.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_thoiGian.setBounds(538, 343, 441, 22);
		add(lb_thoiGian);
	}

	public void diaDiem() {
		JLabel lblaim = new JLabel("Địa điểm");
		lblaim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblaim.setBounds(283, 394, 84, 22);
		add(lblaim);

		JLabel lb_diaDiem = new JLabel("New label");
		lb_diaDiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_diaDiem.setBounds(538, 394, 441, 22);
		add(lb_diaDiem);
	}
}

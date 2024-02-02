package admin.danh_sach_tham_gia;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout; // Import BoxLayout
import javax.swing.JOptionPane;

public class ParticipantView extends JPanel {
	public ParticipantView() {
		// Tạo một JPanel để chứa các JButton với BoxLayout theo chiều dọc
		JPanel buttonPanel = new JPanel();
		JButton bt_return = new JButton("Quay lại");
		bt_return.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Xử lý sự kiện khi nút "Quay lại" được nhấn
				System.out.println("Button 'Return' clicked");
				// HomepageController.getInstance().showHomepage();
			}
		});

		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

		// Lấy chiều ngang của màn hình
		// int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

		// Thêm các JButton vào panel và thiết lập chiều ngang cho mỗi button
		for (int i = 1; i <= 40; i++) {
			JButton button = new JButton("<html>Tên " + i + "<br>Thời gian <br> nhóm máu </html>");

			// Thiết lập biến cho mỗi JButton (ở đây là chỉ số của button)
			button.setActionCommand(String.valueOf(i));

			// Thêm sự kiện ActionListener để xử lý sự kiện khi button được nhấn
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Lấy biến từ JButton được nhấn
					String variable = ((JButton) e.getSource()).getActionCommand();
					System.out.println("Variable of the clicked button: " + variable);
					int choice = JOptionPane.showConfirmDialog(null,
							"Bạn có muốn xóa không?",
							"Xác nhận xóa",
							JOptionPane.YES_NO_OPTION);

					if (choice == JOptionPane.YES_OPTION) {
						// Thực hiện thao tác xóa ở đây
						JOptionPane.showMessageDialog(null, "Xóa thành công!");
					} else {
						// Người dùng chọn không, không thực hiện thao tác xóa
						JOptionPane.showMessageDialog(null, "Không xóa.");
					}
				}
			});
			buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));

			buttonPanel.add(button);
		}

		// Tạo JScrollPane để cuộn nếu có nhiều nút
		JScrollPane scrollPane = new JScrollPane(buttonPanel);// Đặt kích thước theo chiều cao màn hình mong muốn
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Sử dụng BoxLayout theo chiều dọc cho EventView
		this.add(scrollPane);
	}
}
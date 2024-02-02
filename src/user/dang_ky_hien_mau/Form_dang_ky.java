package user.dang_ky_hien_mau;

// package user.dang_ky_hien_mau;

// import javax.swing.JPanel;

// public class Form_dang_ky extends JPanel {

// 	private static final long serialVersionUID = 1L;

// 	/**
// 	 * Create the panel.
// 	 */
// 	public Form_dang_ky() {

// 	}

// }
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Form_dang_ky {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JOptionPane Example");

        JButton button = new JButton("Hiển thị thông báo");
        button.addActionListener(e -> showCustomDialog(frame));

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void showCustomDialog(JFrame frame) {
        // Hiển thị hộp thoại thông báo với hai nút chọn
        int choice = JOptionPane.showOptionDialog(
                frame,
                "Có muốn xóa hay không?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Đmm", "ĐCM"},
                "Không"
        );

        // Xử lý lựa chọn của người dùng
        if (choice == JOptionPane.YES_OPTION) {
            // Người dùng chọn "Có"
            System.out.println("Đã chọn Có - Thực hiện xóa");
        } else {
            // Người dùng chọn "Không" hoặc đóng cửa sổ
            System.out.println("Đã chọn Không hoặc đóng cửa sổ");
        }
    }
}

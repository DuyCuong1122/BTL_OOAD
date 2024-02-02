package Event;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import homepage_user.HomepageController;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout; // Import BoxLayout

public class EventView extends JPanel {
    public EventView() {
        // Tạo một JPanel để chứa các JButton với BoxLayout theo chiều dọc
        JPanel buttonPanel = new JPanel();
        JButton bt_return = new JButton("Quay lại");
        bt_return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý sự kiện khi nút "Quay lại" được nhấn
                System.out.println("Button 'Return' clicked");
                HomepageController.getInstance().showHomepage();
            }
        });
        this.add(bt_return, BorderLayout.PAGE_START);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // Lấy chiều ngang của màn hình
        // int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

        // Thêm các JButton vào panel và thiết lập chiều ngang cho mỗi button
        List<String> list_id_event = EventController.getallEvent();
        int k;
        for (int i = 0; i < list_id_event.size(); i++) {
            k = i + 1;
            JButton button = new JButton("<html>Event " + k + "</html>");

            // Thiết lập biến cho mỗi JButton (ở đây là chỉ số của button)
            button.setActionCommand(String.valueOf(k));

            // Thêm sự kiện ActionListener để xử lý sự kiện khi button được nhấn
            int finalI = i;
            System.out.println(list_id_event.get(finalI));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lấy biến từ JButton được nhấn
                    String variable = ((JButton) e.getSource()).getActionCommand();
                    System.out.println("Variable of the clicked button: " + variable);
                    System.out.println(list_id_event.get(finalI));
                    EventController.getInstance(list_id_event.get(finalI)).showInfoEvent(list_id_event.get(finalI));
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

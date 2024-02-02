package Info_event;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import Event.EventController;
import homepage_user.HomepageController;
public class Info_eventView extends JPanel{
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

//        tenSuKien();
//        noiDung();
//        diaDiem();
//        thoiGian();
//        button_return();
//        button_thamGia();
    }

    public Info_eventView(String id) {
        setLayout(null);

        JLabel aa = new JLabel("Thông tin sự kiện");
        aa.setFont(new Font("Tahoma", Font.BOLD, 28));
        aa.setBounds(493, 5, 325, 81);
        add(aa);

        tenSuKien(id);
        noiDung(id);
        diaDiem(id);
        thoiGian(id);
        ketThuc(id);
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
                JOptionPane.showMessageDialog(null, "Đăng ký tham gia sự kiện thành công");
            }
        });
    }

    public void tenSuKien(String id) {
        JLabel lblNewLabel = new JLabel("Sự kiện");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(283, 130, 84, 22);
        add(lblNewLabel);

        JLabel lb_event = new JLabel(EventController.getInstance(id).getTen());
        lb_event.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_event.setBounds(538, 130, 441, 22);
        add(lb_event);
    }

    public void noiDung(String id) {
        JLabel lblNiDung = new JLabel("Nội dung");
        lblNiDung.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNiDung.setBounds(283, 178, 84, 22);
        add(lblNiDung);
        JLabel lb_noiDung = new JLabel(EventController.getInstance(id).getNoiDung());
        lb_noiDung.setVerticalAlignment(SwingConstants.TOP);
        lb_noiDung.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_noiDung.setBounds(538, 178, 441, 141);
        add(lb_noiDung);
    }

    public void thoiGian(String id) {
        JLabel lblThiGian = new JLabel("Ngày bắt đầu");
        lblThiGian.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblThiGian.setBounds(283, 343, 400, 22);
        add(lblThiGian);

        JLabel lb_thoiGian = new JLabel(EventController.getInstance(id).getNgayBatdau());
        lb_thoiGian.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_thoiGian.setBounds(538, 343, 441, 22);
        add(lb_thoiGian);
    }

    public void diaDiem(String id) {
        JLabel lblaim = new JLabel("Địa điểm");
        lblaim.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblaim.setBounds(283, 394, 84, 22);
        add(lblaim);

        JLabel lb_diaDiem = new JLabel(EventController.getInstance(id).getViTri());
        lb_diaDiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_diaDiem.setBounds(538, 394, 441, 22);
        add(lb_diaDiem);
    }

    public void ketThuc(String id) {
        JLabel lblNewLabel = new JLabel("Ngày kết thúc");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(283, 444, 400, 22);
        add(lblNewLabel);

        JLabel lb_event = new JLabel(EventController.getInstance(id).getNgayKetthuc());
        lb_event.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_event.setBounds(538, 444, 441, 22);
        add(lb_event);
    }
}

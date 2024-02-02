package admin.homepage_admin;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomepageView extends JPanel {

    private static final long serialVersionUID = 1L;

    public HomepageView() {

        setLayout(null);

        JLabel lblMotGiotMau = new JLabel("Một giọt máu triệu tấm lòng");
        lblMotGiotMau.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMotGiotMau.setBounds(640, 271, 403, 25);
        add(lblMotGiotMau);

        JLabel lblUngDungQuanLy = new JLabel("Ứng dụng quản lý tham gia hiến máu");
        lblUngDungQuanLy.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblUngDungQuanLy.setBounds(560, 216, 525, 62);
        add(lblUngDungQuanLy);

        JButton bt_infoEvent = new JButton("Thông tin sự kiện");
        bt_infoEvent.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt_infoEvent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomepageController.getInstance().showEventPage();
            }
        });
        bt_infoEvent.setBounds(450, 352, 649, 69);
        add(bt_infoEvent);

        JButton bt_join = new JButton("Danh sách người tham gia");
        bt_join.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomepageController.getInstance().showEventJoinPage();
            }
        });
        bt_join.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt_join.setBounds(450, 469, 649, 69);
        add(bt_join);

        JButton btnHelp = new JButton("Hỗ trợ");
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomepageController.getInstance().showHelpPage();
            }
        });
        btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btnHelp.setBounds(65, 72, 97, 31);
        add(btnHelp);
    }
}

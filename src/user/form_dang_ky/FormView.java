package user.form_dang_ky;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import org.w3c.dom.events.Event;

import user.Infomation.InforController;
import user.homepage_user.HomepageController;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class FormView extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField tA_thoiGianThamGia;
    private JLabel lb_event;
    private JLabel lb_thoiGianEvent;
    private JLabel lb_diaDiem;
    private JComboBox cB_luongMauHien;
    private String luongMauHien;
    /**
     * Create the panel.
     */
    public FormView() {
        setLayout(null);

        JLabel lblNewLabel = new JLabel("Biểu mẫu đăng ký hiến máu");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblNewLabel.setBounds(500, 5, 408, 109);
        add(lblNewLabel);

        // event();
        // eventTime();
        // diaDiem();
        // joinTime();
        // luongMauHien();
        // button_dangKy();

    }

    public FormView(String id) {
        setLayout(null);

        JLabel lblNewLabel = new JLabel("Biểu mẫu đăng ký hiến máu");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblNewLabel.setBounds(500, 5, 408, 109);
        add(lblNewLabel);

        event(id);
        eventTime(id);
        diaDiem(id);
        joinTime(id);
        luongMauHien();
        button_dangKy();

    }

    public void event(String id) {
        JLabel lblNewLabel_1_1 = new JLabel("Sự kiện tham gia");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1.setBounds(400, 200, 143, 26);
        add(lblNewLabel_1_1);

        lb_event = new JLabel(Event.EventController.getInstance(id).getTen());
        lb_event.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_event.setBounds(800, 200, 400, 26);
        add(lb_event);

    }

    public void eventTime(String id) {
        JLabel lblNewLabel_1_2 = new JLabel("Thời gian tổ chức");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_2.setBounds(400, 250, 143, 26);
        add(lblNewLabel_1_2);

        lb_thoiGianEvent = new JLabel(Event.EventController.getInstance(id).getNgayBatdau());
        lb_thoiGianEvent.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_thoiGianEvent.setBounds(800, 250, 118, 26);
        add(lb_thoiGianEvent);
    }

    public void diaDiem(String id) {
        JLabel lblNewLabel_1_3 = new JLabel("Địa điểm tổ chức");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_3.setBounds(400, 300, 250, 26);
        add(lblNewLabel_1_3);

        lb_diaDiem = new JLabel(Event.EventController.getInstance(id).getViTri());
        lb_diaDiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lb_diaDiem.setBounds(800, 300, 118, 26);
        add(lb_diaDiem);
    }

    public void joinTime(String id) {
        JLabel lblNewLabel_1_4 = new JLabel("Thời gian tham gia");
        lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_4.setBounds(400, 350, 158, 26);
        add(lblNewLabel_1_4);

        tA_thoiGianThamGia = new JTextField();
        tA_thoiGianThamGia.setFont(new Font("Tahoma", Font.PLAIN, 18));
        tA_thoiGianThamGia.setBounds(800, 350, 133, 26);
        add(tA_thoiGianThamGia);
        tA_thoiGianThamGia.setColumns(10);
    }

    public void luongMauHien() {
        JLabel lblNewLabel_1_5 = new JLabel("Lượng máu hiến");
        lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_5.setBounds(400, 400, 143, 26);
        add(lblNewLabel_1_5);

        cB_luongMauHien = new JComboBox();
        cB_luongMauHien.setModel(new DefaultComboBoxModel(new String[] { "200", "300" }));
        cB_luongMauHien.addActionListener(e-> {
            String luongMauHien = (String) cB_luongMauHien.getSelectedItem();
            FormController.getInstance().set_luongMauHien(luongMauHien);
        });
        cB_luongMauHien.setFont(new Font("Tahoma", Font.PLAIN, 18));
        cB_luongMauHien.setBounds(800, 400, 133, 26);
        add(cB_luongMauHien);
    }

    public void button_dangKy() {
        
        cB_luongMauHien.addActionListener(e-> {
            luongMauHien = (String) cB_luongMauHien.getSelectedItem();
            
        });
        JButton bt_dangKy = new JButton("Đăng ký");
        bt_dangKy.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bt_dangKy.setBounds(1015, 680, 149, 42);
        bt_dangKy.addActionListener(e-> {
            FormController.getInstance().set_luongMauHien(luongMauHien);
            FormController.getInstance().set_ngayThamGia(tA_thoiGianThamGia.getText());
        });
        add(bt_dangKy);
        // bt_dangKy.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(java.awt.event.ActionEvent e) {
        // System.out.println("Button 'Return' clicked");
        // HomepageController.getInstance().showEventPage();
        // }
        // });
        
    }
}

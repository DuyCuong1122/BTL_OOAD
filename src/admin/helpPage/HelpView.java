package admin.helpPage;

import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

import homepage_user.HomepageController;

public class HelpView extends JPanel {

	public HelpView() {

		setLayout(null);

		JButton bt_return = new JButton("Quay về");
		bt_return.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bt_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomepageController.getInstance().showHomepage();
			}
		});
		bt_return.setBounds(37, 37, 116, 31);
		add(bt_return);

		JTextArea txtrNuCKh = new JTextArea();
		txtrNuCKh.setFont(new Font("Monospaced", Font.PLAIN, 30));
		txtrNuCKh.setText("Nếu có thắc mắc, vui lòng liên hệ:\r\nLê Duy Cường - SDT 0339269975");
		txtrNuCKh.setBounds(157, 176, 611, 149);
		add(txtrNuCKh);
	}
}

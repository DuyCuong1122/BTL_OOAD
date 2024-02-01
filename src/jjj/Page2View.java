package jjj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page2View extends JPanel {
    private JButton previousPageButton;

    public Page2View() {
        previousPageButton = new JButton("Previous Page");
        previousPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Khi nút được nhấn, thông báo Controller để quay lại trang thứ nhất
                Controller.getInstance().showPage1();
            }
        });

        add(previousPageButton);
    }
}


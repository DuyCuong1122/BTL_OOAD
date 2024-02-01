package jjj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page1View extends JPanel {
    private JButton nextPageButton;

    public Page1View() {
        nextPageButton = new JButton("Next Page");
        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Khi nút được nhấn, thông báo Controller để chuyển đến trang thứ hai
                Controller.getInstance().showPage2();
            }
        });

        add(nextPageButton);
    }
}


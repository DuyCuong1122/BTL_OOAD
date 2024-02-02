package jjj;

import javax.swing.*;
import java.awt.*;

public class ScrollableLabelsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vertical Scrollable Labels Example");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Label đầu tiên
        JLabel headerLabel = new JLabel("Danh sách các label");
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        // Panel chứa headerLabel và danh sách các label
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(headerLabel, BorderLayout.CENTER);

        mainPanel.add(headerPanel);

        // Tạo một hộp chứa các JLabel để sử dụng BoxLayout
        Box labelBox = Box.createVerticalBox();

        for (int i = 1; i <= 20; i++) {
            JLabel label = new JLabel("Label " + i);
            labelBox.add(label);
        }

        mainPanel.add(labelBox);

        JScrollPane scrollPane = new JScrollPane(mainPanel);

        frame.getContentPane().add(scrollPane);

        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

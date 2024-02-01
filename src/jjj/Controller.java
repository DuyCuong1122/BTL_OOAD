package jjj;

import javax.swing.*;

public class Controller {
    private static Controller instance;
    private JFrame frame;
    private Page1View page1View;
    private Page2View page2View;
    private Model model;

    private Controller() {
        frame = new JFrame("MVC Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        page1View = new Page1View();
        page2View = new Page2View();
        model = Model.getInstance();

        frame.add(page1View);
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public void showPage1() {
        frame.getContentPane().removeAll();
        frame.add(page1View);
        System.out.println("Data from Model: " + model.getData()); // In dữ liệu từ Model
        frame.revalidate();
        frame.repaint();
    }

    public void showPage2() {
        frame.getContentPane().removeAll();
        frame.add(page2View);
        System.out.println("Data from Model  123: " + model.getData()); // In dữ liệu từ Model
        frame.revalidate();
        frame.repaint();
    }

    public void start() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Controller.getInstance().start();
            }
        });
    }
}


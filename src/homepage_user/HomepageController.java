package homepage_user;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Change_Information.Change_infoView;
import Infomation.InforView;
import helpPage.HelpView;

public class HomepageController {
    private static HomepageController instance;
    private JFrame rootFrame;
    private HelpView helpView;
    private HomepageModel homePageModel;
    private HomepageView homePageView;
    private InforView infoView;
    private Change_infoView changeInfoView;

    private HomepageController() {
        homePageModel = new HomepageModel();
        rootFrame = new JFrame();
        rootFrame.setTitle(homePageModel.getTitle());
        rootFrame.setBounds(100, 100, 1035, 585);
        rootFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homePageView = new HomepageView();
        helpView = new HelpView();
        infoView = new InforView();
        changeInfoView = new Change_infoView();
        rootFrame.add(homePageView);
    }

    public static HomepageController getInstance() {
        if (instance == null) {
            instance = new HomepageController();
        }
        return instance;
    }

    public void showHomepage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(homePageView);
        System.out.println("Data from Model: " + homePageModel.getData());
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showHelpPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(helpView);
        System.out.println("Data from Model: " + " Help page");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showInfoPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(infoView);
        System.out.println("Data from Model: Info page ");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showChangeInfoPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(changeInfoView);
        System.out.println("Data from Model: Change Info page ");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void start() {
        rootFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HomepageController.getInstance().start();
            }
        });
    }

}

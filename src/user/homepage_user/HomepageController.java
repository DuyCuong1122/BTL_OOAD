package user.homepage_user;

import javax.swing.JFrame;
import user.Infomation.InforView;
import user.change_information.Change_infoView;
import user.event.EventView;
import user.helpPage.HelpView;
import user.info_event.Info_eventView;
import javax.swing.SwingUtilities;

public class HomepageController {
    private static HomepageController instance;
    private JFrame rootFrame;
    private HelpView helpView;
    private HomepageModel homePageModel;
    private HomepageView homePageView;
    private InforView infoView;
    private Change_infoView changeInfoView;
    private EventView eventView;
    private Info_eventView infoEventView;

    private HomepageController() {
        homePageModel = new HomepageModel();
        rootFrame = new JFrame();
        rootFrame.setTitle(homePageModel.getTitle());
        rootFrame.setBounds(100, 100, 1035, 585);
        rootFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homePageView = new HomepageView();
        helpView = new HelpView();
        infoView = new InforView();
        eventView = new EventView();
        infoEventView = new Info_eventView();
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
        infoView = new InforView();
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

    public void showEventPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(eventView);
        System.out.println("Data from Model: Event page ");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showInfoEventPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(infoEventView);
        System.out.println("Data from Model: Info Event page ");
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

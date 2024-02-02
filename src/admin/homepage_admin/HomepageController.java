package admin.homepage_admin;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import admin.add_event.Add_eventView;
import admin.danh_sach_tham_gia.ParticipantView;
import admin.event.EventView;
import admin.event_join.Event_joinView;
import admin.helpPage.HelpView;
import admin.info_event.Info_eventView;





public class HomepageController {
    private static HomepageController instance;
    private JFrame rootFrame;
    private HelpView helpView;
    private HomepageModel homePageModel;
    private HomepageView homePageView;
    private EventView eventView;
    private Add_eventView add_eventView;
    private Info_eventView info_eventView;
    private Event_joinView event_joinView;
    private ParticipantView participantView;

    private HomepageController() {
        homePageModel = new HomepageModel();
        rootFrame = new JFrame();
        rootFrame.setTitle(homePageModel.getTitle());
        rootFrame.setBounds(100, 100, 1035, 585);
        rootFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homePageView = new HomepageView();
        helpView = new HelpView();
        eventView = new EventView();
        add_eventView = new Add_eventView();
        info_eventView = new Info_eventView();
        event_joinView = new Event_joinView();
        participantView = new ParticipantView();
        rootFrame.add(homePageView);
    }

    public static HomepageController getInstance() {
        if (instance == null) {
            instance = new HomepageController();
            System.out.println("HomepageController created\n");
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

    public void showEventPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(eventView);
        System.out.println("Data from Model: " + " Event page");
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

    public void showAddEventPage()
    {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(add_eventView);
        System.out.println("Data from Model: " + " Add event page");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showInfoEventPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(info_eventView);
        System.out.println("Data from Model: " + " Info event page");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showEventJoinPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(event_joinView);
        System.out.println("Data from Model: " + " Event join page");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showParticipantPage() {
        rootFrame.getContentPane().removeAll();
        rootFrame.add(participantView);
        System.out.println("Data from Model: " + " Participant page");
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

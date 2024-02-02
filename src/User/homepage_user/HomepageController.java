package homepage_user;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Change_Information.Change_infoView;
import Event.EventView;
import Info_event.Info_eventView;
import Infomation.InforView;
import helpPage.HelpView;
import Sign_in.Sign_inView;
import Sign_up.Sign_upView;

public class HomepageController {
    private static HomepageController instance;
    private JFrame rootFrame;
    private HelpView helpView;
    private HomepageModel homePageModel;
    private HomepageView homePageView;
    private InforView infoView;
    private Change_infoView changeInfoView;
    private Sign_inView sign_inView;
    private Sign_upView sign_upView;
    private EventView eventView;
    private Info_eventView infoEventView;
    private String id;
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
        eventView = new EventView();
        infoEventView = new Info_eventView();
        sign_inView = new Sign_inView();
        sign_upView = new Sign_upView();
        rootFrame.add(sign_inView);
    }

    public static HomepageController getInstance() {
        if (instance == null) {
            instance = new HomepageController();
        }
        return instance;
    }

    public void setID(String id){
        this.id = id;
    }
    public String getID(){
        return this.id;
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
        InforView infoView = new InforView(id);
        rootFrame.add(infoView);
        System.out.println("Data from Model: Info page ");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showChangeInfoPage() {
        rootFrame.getContentPane().removeAll();
        Change_infoView changeInfoView = new Change_infoView(this.id);
        rootFrame.add(changeInfoView);
        System.out.println("Data from Model: Change Info page ");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showSignUpView(){
        rootFrame.getContentPane().removeAll();
        rootFrame.add(sign_upView);
        System.out.println("Data from Model: Sign up page ");
        rootFrame.revalidate();
        rootFrame.repaint();
    }

    public void showSignInView(){
        rootFrame.getContentPane().removeAll();
        rootFrame.add(sign_inView);
        System.out.println("Data from Model: Sign up page ");
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

    public void showInfoEventPage(String id_event) {
        rootFrame.getContentPane().removeAll();
        Info_eventView infoEventView2 = new Info_eventView(id_event);
        rootFrame.add(infoEventView2);
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
            public void run() {HomepageController.getInstance().start();
            }
        });
    }

}

package Event;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class eventView extends JPanel {

	private static final long serialVersionUID = 1L;
	public String[] hehe = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
	public List<String> items = new ArrayList<String>();
	
	public eventView() {
		setLayout(null);
		for (int i = 0; i < hehe.length; i++) {
			items.add(hehe[i]);
		}
		JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        
        
  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        add(scrollableTextArea);
	}
}

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Cal extends JFrame {

	public Cal() throws Exception {
		super ("Calculadora");
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setLocation(400, 200);
		
		setLayout(new BorderLayout());
		
		
		TextPanel textePanel = new TextPanel();
		add(BorderLayout.NORTH, textePanel);
		
		JPanel digitsPanel = new JPanel();
		digitsPanel.setLayout(new BorderLayout());
		digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textePanel.getTxtNumber()));
		
		digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textePanel.getTxtNumber()));
		
		add(BorderLayout.CENTER, digitsPanel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		new Cal();
	}
}

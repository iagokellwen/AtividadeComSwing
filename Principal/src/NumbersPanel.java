import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumbersPanel extends JPanel implements ActionListener {
	
	private JTextField txtText;
	
	
	public NumbersPanel(JTextField txtText) {
		this.txtText = txtText;
		
		setLayout(new GridLayout(4, 3));
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(this);
		add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(this);
		add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(this);
		add(bt3);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(this);
		add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(this);
		add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(this);
		add(bt6);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(this);
		add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(this);
		add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(this);
		add(bt9);
		
		JButton btEmpty1 = new JButton("");
		btEmpty1.setEnabled(false);
		add(btEmpty1);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(this);
		add(bt0);
		
		JButton btp = new JButton(".");
		btp.addActionListener(this);
		add(btp);
		

		
		
		
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(txtText.getText().length() == 10) {
			return;
		}
		
		JButton bt = (JButton) e.getSource();
		String number = bt.getText();
		txtText.setText(txtText.getText() + number);
	}

	}


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OperationsPanel extends JPanel implements ActionListener {
	
	private JTextField txtText;
	private char op;
	private double valor1;
	private double valor2;
	
	
	private JButton btSoma;
	private JButton btSub;
	private JButton btMult;
	private JButton btDiv;
	private JButton btIgual;
	private JButton btLimpar;
	
	public OperationsPanel(JTextField txtText) {
		this.txtText = txtText;
		
		setLayout(new GridLayout(3, 2));
		
		btSoma = new JButton("+");
		btSoma.addActionListener(this);
		add(btSoma);
		
		btSub = new JButton("-");
		btSub.addActionListener(this);
		add(btSub);
		
		btMult = new JButton("*");
		btMult.addActionListener(this);
		add(btMult);
		
		btDiv = new JButton("/");
		btDiv.addActionListener(this);
		add(btDiv);
		
		btIgual = new JButton("=");
		btIgual.addActionListener(this);
		add(btIgual);
		
		btLimpar = new JButton("C");
		btLimpar.addActionListener(this);
		add(btLimpar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(txtText.getText().isEmpty()) {
			return;
		}
		
		JButton bt = (JButton) e.getSource();
		
		if (bt == btLimpar) {
			op = '\u0000';
			txtText.setText("");
			
		}else if (bt == btIgual){
			valor2 = Double.parseDouble(txtText.getText());
			
			double result = 0.0;
			
			if(op == '+') {
				result = valor1 + valor2;
			} else if(op == '-') {
				result = valor1 - valor2;
			} else if(op == '*') {
				result = valor1 * valor2;
			} else if(op == '/') {
				result = valor1 / valor2;
			}
			txtText.setText(String.valueOf(result));
			op = '\u0000';
			valor1 = result;
			valor2 = 0;
		}else {
			op = bt.getText().charAt(0);
			valor1 = Double.parseDouble(txtText.getText());
			txtText.setText("");
		}
		
	}
}
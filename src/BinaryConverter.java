import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		new BinaryConverter().createUI();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField input = new JTextField(20);
	JLabel output = new JLabel(" ");
	
	private void createUI() {
			
		frame.setVisible(true);
		button.setText("convert");
		button.addActionListener(this);
		panel.add(button);
		panel.add(input);
		panel.add(output);
		frame.add(panel);
		frame.pack();
		frame.setTitle("Convert 8 bits of binary to ASCII");
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		output.setText(convert(input.getText()));
		
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}

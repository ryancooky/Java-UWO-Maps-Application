package uwoMaps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ForgotPasswordPage extends JFrame implements ActionListener{
	
	JLabel pageLabel = new JLabel("Forgot Password");
	JLabel emailLabel = new JLabel("Email:");
	JTextField emailField = new JTextField();
	JButton resetButton = new JButton("Reset Password");
	JButton backButton = new JButton("Back to Login");
	
	HashMap<String,String> loginInfo = new HashMap<String,String>();

	
	ForgotPasswordPage(){
		
		Main.MFRAME.setVisible(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle("Forgot Password");
		
		pageLabel.setBounds(50, 150, 250, 25);
		pageLabel.setFont(new Font(null, Font.BOLD, 20));
		
		emailLabel.setBounds(50, 200, 75, 25);
		emailField.setBounds(125, 200, 250, 25);
		
		resetButton.setBounds(175, 240, 120, 40);
		backButton.setBounds(0, 0, 120, 40);
		
		backButton.addActionListener(this);
		resetButton.addActionListener(this);
		
		
		this.add(pageLabel);
		this.add(emailLabel);
		this.add(emailField);
		this.add(resetButton);
		this.add(backButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backButton) {
			Main.loginFRAME.setVisible(true);
	        this.dispose();
		}
	}
}

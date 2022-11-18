package uwoMaps;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginFrame extends JFrame implements ActionListener{
	
	JButton signInButton;
	JButton forgotPasswordButton;
	JLabel forgotPasswordLabel;
	
	LoginFrame(){
		
		signInButton = new JButton("Sign in");
		signInButton.setBounds(125, 320, 80, 40);
		signInButton.addActionListener(this);
		signInButton.setFont(new Font("Balgin", Font.PLAIN, 18));
		signInButton.setBackground(Color.cyan);
		signInButton.setBorder(BorderFactory.createEtchedBorder());
		
		forgotPasswordButton = new JButton("Forgot password?");
		forgotPasswordButton.setBounds(250, 320, 140, 40);
		forgotPasswordButton.addActionListener(this);
		forgotPasswordButton.setFont(new Font("Balgin", Font.PLAIN, 14));
		forgotPasswordButton.setBackground(Color.cyan);
		forgotPasswordButton.setBorder(BorderFactory.createEtchedBorder());
		
		forgotPasswordLabel = new JLabel();
		forgotPasswordLabel.setText("Enter a new password: ");
		forgotPasswordLabel.setBounds(150,200,150,150);
		forgotPasswordLabel.setVisible(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Login");
		
		this.add(signInButton);
		this.add(forgotPasswordButton);
		this.add(forgotPasswordLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == signInButton) {
			System.out.println("Poo");
			//check if the password is correct for the username
		} else if (e.getSource() == forgotPasswordButton) {
			forgotPasswordLabel.setVisible(true);
			//prompt them to enter a different password
		}
		
	}
}

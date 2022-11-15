package uwoMaps;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Uwo maps");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        
        JButton loginButton = new JButton("Login");
        frame.getContentPane().add(loginButton);
        
        frame.setVisible(true);
	}
}

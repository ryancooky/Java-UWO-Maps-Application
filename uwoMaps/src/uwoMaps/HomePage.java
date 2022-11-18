package uwoMaps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePage extends JFrame implements ActionListener{
	
	JLabel titleLabel = new JLabel("UWO Maps");
	
	HomePage(String userId){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("Home");
		
		titleLabel.setBounds(0, 0, 200, 35);
		titleLabel.setFont(new Font(null, Font.BOLD, 20));
		
		this.add(titleLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

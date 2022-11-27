package uwoMaps;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HomePage extends JFrame implements ActionListener{
	
	JButton signOutButton = new JButton();
	JButton myAccountButton = new JButton();
	
	JButton goToMapButton = new JButton();
	
	JLabel buildingsLabel = new JLabel("List of Buildings: ");
	JLabel favouritesLabel = new JLabel("Favourite POIs: ");
	JLabel searchLabel = new JLabel("Search: ");
	JLabel weatherLabel = new JLabel("Today's weather: ");
	
	JTextField searchField = new JTextField();
	
	Favourite[] favList;
	
	public String user;
	
	
	HomePage(String userId){
		
		Main.loginFRAME.setVisible(false);
		Main.MFRAME = this;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("Uwo Maps Home");
		
		user = userId;
		
		buildingsLabel.setBounds(50,80,150,40);
		
		favouritesLabel.setBounds(50,280,150,40);
		
		searchLabel.setBounds(350, 80, 150, 40);
		
		weatherLabel.setBounds(350, 280, 150, 40);
		
		signOutButton.addActionListener(this);
		signOutButton.setText("Sign Out");
		signOutButton.setBounds(0, 0, 120, 40);
		
		myAccountButton.addActionListener(this);
		myAccountButton.setText("My Account");
		myAccountButton.setBounds(600,0,100,40);
		
		goToMapButton.addActionListener(this);
		goToMapButton.setText("Go to Map");
		goToMapButton.setBounds(50, 120, 100, 40);
		
		searchField.setBounds(350, 120, 240, 40);
		searchField.setText("search for a class");

		this.add(signOutButton);
		this.add(myAccountButton);
		this.add(goToMapButton);
		this.add(buildingsLabel);
		this.add(favouritesLabel);
		this.add(searchLabel);
		this.add(weatherLabel);
		this.add(searchField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signOutButton) {
			Main.loginFRAME.setVisible(true);
	        this.dispose();
		}
		if (e.getSource() == goToMapButton) {
			openCampusMap();
		}
		
	}
	
	public void openCampusMap(/*your parms*/){
		CampusMap campusFrm = new CampusMap();
	}

}

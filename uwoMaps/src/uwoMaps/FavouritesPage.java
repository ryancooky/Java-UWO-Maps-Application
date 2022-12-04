package uwoMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

public class FavouritesPage extends JFrame implements ActionListener{
	
	JButton backButton = new JButton("Go Back");
	JButton goButtotn = new JButton("Go Favourites");
	JLabel listLabel = new JLabel("List of Favourites: ");
	DefaultListModel <String> favList = new DefaultListModel<>();
	JList<String> listBox;
	Favourite fav;
	String userName = Main.MFRAME.user;
	
	public FavouritesPage(){
		
		
		
		Main.MFRAME.setVisible(false);
		fav = UserData.getFavs(Main.CURRENTUSER);
		
		for(POI i : fav.getListOfFavs()) { 
		    favList.addElement(i.name);
		}
		
		listBox = new JList<>(favList);

		backButton.setBounds(0, 0, 120, 40);
		backButton.addActionListener(this);
		goButtotn.setBounds(350, 120, 120, 40);
		goButtotn.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("My Favourites");
		
		listLabel.setBounds(50,80,150,40);
		listBox.setBounds(50,140,150,200);
		
		this.add(listLabel);
		this.add(backButton);
		this.add(goButtotn);
		this.add(listBox); 
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == backButton) {
			Main.MFRAME.setVisible(true);
	        this.dispose();
		}
		else if (e.getSource() == goButtotn) {
			String name;
			
	        this.dispose();
			name = listBox.getSelectedValue();
	    	for(POI i : fav.getListOfFavs()) { 
	    		if (name == i.name) {

	    			String building = i.getBuildingName();
	    			System.out.println(building);
	    			Floor floor = i.getFloor(); 
	    			System.out.println(floor);
	    		}
			}
	    	

		}
	}

}

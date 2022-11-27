package uwoMaps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 * 
 * @author Minsoo Park, mpark227@uwo.ca
 * @version 1.2
 * @since 1.0
 * 
 * This class represents the basic template for a Campus Map
 * 
 * <p>
 * CampusMap class is base of our map application. It has building list which contain
 * our main 3 buildings. But the add and remove method are restricted to
 * authorized user.
 * <p>
 */
public class CampusMap extends JFrame implements ActionListener{
	
	/**
	 * @param currentBuilding - current building
	 * @param first/second/last building - store the 3 building for now
	 * @param mode - indicate users' mode
	 * @param buildingList - list of building
	 */
	private Building currentBuilding;
	public Building firstBuilding;
	public Building secondBuilding;
	public Building thirdBuilding;
	
	ArrayList<Building> buildingList = new ArrayList<>();
	
	JLabel titleLabel = new JLabel("Building Maps");
	JButton buildingBtn = new JButton("Building List");
	JButton addBtn = new JButton("Add");
	JButton removeBtn = new JButton("Remove");
	JButton helpBtn = new JButton("Help");
	
	boolean canEdit;
	
	/*
	 * Constructor that initializes all the instance variables
	 * setting the button and list frame
	 */
	public CampusMap() {
		
		//Next version should include way to store selected building data
		firstBuilding  = new Building("Alumni Hall", 3 , 4);
		secondBuilding = null;
		thirdBuilding = null;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("Home");
		
		titleLabel.setBounds(130, 60, 200, 35);
		titleLabel.setFont(new Font(null, Font.BOLD, 20));
		
		buildingBtn.setBounds(130,100,140,30);
		buildingBtn.addActionListener(this);
		addBtn.setBounds(130,220,140,30);
		addBtn.addActionListener(this);
		removeBtn.setBounds(130,260,140,30);
		removeBtn.addActionListener(this);
		helpBtn.setBounds(130,300,140,30);
		helpBtn.addActionListener(this);
		
		this.add(titleLabel);
		this.add(buildingBtn);

		this.add(addBtn);
		this.add(removeBtn);
		this.add(helpBtn);
		
		
		//added by dalter4@uwo.ca, checks the userdata if user can edit and sets the variable
		if (Main.loginFRAME.userdata.canUserEdit(Main.MFRAME.user)) {
			canEdit = true;
		} else {
			canEdit = false;
		}
		
	}
	
	/**
	 * Gets the current building
	 * @return currentBuilding
	 */
	public Building getBuildings() {
		return currentBuilding;
	}
	
	/**
	 * Sets provided building to current building
	 */
	public void setBuilding(Building building) {
		currentBuilding = building;
	}
	
	
	/**
	 * add target building to building list
	 */
	public void addBuilding(Building targetBuilding) {
		//check the mode
		if (canEdit) {
			buildingList.add(targetBuilding);
		}
	}
	
	/**
	 * add current building to building list
	 */
	public void addBuilding() {
		if (canEdit) {
			buildingList.add(this.currentBuilding);
		}
	}
	
	/**
	 * remove target building from building list
	 */
	public void removeBuilding (Building targetBuilding) {
		if (canEdit) {
			if (buildingList.contains(targetBuilding)) {
				buildingList.remove(targetBuilding);
			}
		}
	}
	/**
	 * remove current building from building list
	 */
	public void removeBuilding () {
		if (canEdit) {
			if (buildingList.contains(this.currentBuilding)) {
				buildingList.remove(this.currentBuilding);
			}
		}
	}
	/**
	 * Test the button
	 * addBtn call the addBuilding method
	 * removeBtn call the removeBuilding method
	 * helpBtn call the Housekeeping class/frame
	 * buildingBtn show the list of current building list
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == addBtn) {
			//add selected building to building list
			addBuilding(firstBuilding);
			System.out.println(buildingList);
		}
		else if (e.getSource() == removeBtn) {
			//remove selected building from building list
			removeBuilding(firstBuilding);
			System.out.println(buildingList);
		}
		else if (e.getSource() == helpBtn) {
			//calling housekeeping class as new frame
			Housekeeping help = new Housekeeping();
			System.out.println(buildingList);
		}
		else if (e.getSource() == buildingBtn) {
			JFrame f = new JFrame("Building List");
			f.add(new JList(buildingList.toArray()));
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setSize(700,500);
	        f.setVisible(true);
		}
	}
}

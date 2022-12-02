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
	public Building firstBuilding = Main.MIDDLESEXCOLLEGE;
	public Building secondBuilding = Main.HEALTHSCIENCESBUILDING;
	public Building thirdBuilding = Main.ALUMNIHALL;
	
	ArrayList<Building> buildingList = new ArrayList<>();
	
	JLabel titleLabel = new JLabel("Building Maps");
	JButton buildingBtn = new JButton("Building List");
	JButton addBtn = new JButton("Add");
	JButton removeBtn = new JButton("Remove");
	JButton helpBtn = new JButton("Help");
	
	JButton firstBuildingButton = new JButton("First Building");
	JButton secondBuildingButton = new JButton("Second Building");
	JButton thirdBuildingButton = new JButton("Third Building");
	
	JButton backButton = new JButton("Go Back");
	
	boolean canEdit;
	
	/*
	 * Constructor that initializes all the instance variables
	 * setting the button and list frame
	 */
	public CampusMap() {
		
		Main.MFRAME.setVisible(false);
		Main.CMAP = this;
		
		//Next version should include way to store selected building data
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Home");
		
		titleLabel.setBounds(130, 60, 200, 35);
		titleLabel.setFont(new Font(null, Font.BOLD, 20));
		
		buildingBtn.setBounds(380,100,140,30);
		buildingBtn.addActionListener(this);
		addBtn.setBounds(380,200,140,30);
		addBtn.addActionListener(this);
		removeBtn.setBounds(380,270,140,30);
		removeBtn.addActionListener(this);
		helpBtn.setBounds(380,340,140,30);
		helpBtn.addActionListener(this);
		backButton.setBounds(0, 0, 120, 40);
		backButton.addActionListener(this);
//		
//		Building middlesexCollege = new Building();
//		middlesexCollege.buildingName = "Middlesex College";
//		middlesexCollege.numOfFloors = 5;
//		middlesexCollege.imageURL = "/MCimages/MC.png";
//		
//		Floor mc1 = new Floor();
//		mc1.floorNum = 1;
//		mc1.imageURL = "/MCimages/MC-1.png";
//		
//		middlesexCollege.floors.add(mc1);
//		
//		Building healthScienceBuilding = new Building();
//		healthScienceBuilding.buildingName = "Health Sciences Building";
//		healthScienceBuilding.numOfFloors = 4;
//		healthScienceBuilding.imageURL = "/HSBimages/HSB.png";
//		Building alumniHall = new Building();
//		alumniHall.buildingName = "Alumni Hall";
//		alumniHall.numOfFloors = 3;
//		alumniHall.imageURL = "/AHimages/AH.png";
		
		
		firstBuildingButton.addActionListener(this);
		firstBuildingButton.setBounds(130, 100, 180, 40);
		firstBuildingButton.setText(firstBuilding.buildingName);
		
		secondBuildingButton.addActionListener(this);
		secondBuildingButton.setBounds(130, 180, 180, 40);
		secondBuildingButton.setText(secondBuilding.buildingName);
		
		thirdBuildingButton.addActionListener(this);
		thirdBuildingButton.setBounds(130, 260, 180, 40);
		thirdBuildingButton.setText(thirdBuilding.buildingName);
		
		buildingList.add(firstBuilding);
		buildingList.add(secondBuilding);
		buildingList.add(thirdBuilding);
		
		this.add(titleLabel);
		this.add(buildingBtn);

		this.add(addBtn);
		this.add(removeBtn);
		this.add(helpBtn);
		this.add(firstBuildingButton);
		this.add(secondBuildingButton);
		this.add(thirdBuildingButton);
		this.add(backButton);
		
		//added by dalter4@uwo.ca, checks the userdata if user can edit and sets the variable
		//if (Main.loginFRAME.userdata.canUserEdit(Main.MFRAME.user)) {
		//	canEdit = true;
		//} else {
		//	canEdit = false;
		//}
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
			buildingList.add(targetBuilding);
	}
	
	/**
	 * add current building to building list
	 */
	public void addBuilding() {
			buildingList.add(this.currentBuilding);
	}
	
	/**
	 * remove target building from building list
	 */
	public void removeBuilding (Building targetBuilding) {
			if (buildingList.contains(targetBuilding)) {
				buildingList.remove(targetBuilding);
			}
	}
	/**
	 * remove current building from building list
	 */
	public void removeBuilding () {
			if (buildingList.contains(this.currentBuilding)) {
				buildingList.remove(this.currentBuilding);
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
		
		if (e.getSource() == firstBuildingButton) {
			setBuilding(firstBuilding);
			openBuilding(firstBuilding);
		}
		if (e.getSource() == secondBuildingButton) {
			setBuilding(secondBuilding);
			openBuilding(secondBuilding);
		}
		if (e.getSource() == thirdBuildingButton) {
			setBuilding(thirdBuilding);
			openBuilding(thirdBuilding);
		}
		if(e.getSource() == addBtn) {
			//add selected building to building list
			addBuilding(firstBuilding);
			System.out.println(buildingList);
		}
		if (e.getSource() == removeBtn) {
			//remove selected building from building list
			removeBuilding(firstBuilding);
			System.out.println(buildingList);
		}
		if (e.getSource() == helpBtn) {
			//calling housekeeping class as new frame
			Housekeeping help = new Housekeeping();
			System.out.println(buildingList);
		}
		if (e.getSource() == buildingBtn) {
			JFrame f = new JFrame("Building List");
			f.add(new JList(buildingList.toArray()));
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setSize(700,500);
	        f.setVisible(true);
		}
		if (e.getSource() == backButton) {
			Main.MFRAME.setVisible(true);
	        this.dispose();
		}
	}
	
	public void openBuilding(Building b){
		BuildingPage bp = new BuildingPage(b);
	}
}

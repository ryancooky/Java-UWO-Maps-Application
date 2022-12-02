package uwoMaps;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
	
	public static LoginPage loginFRAME;
	public static HomePage MFRAME;
	public static CampusMap CMAP;
	public static BuildingPage BPAGE;
	
	public static Building MIDDLESEXCOLLEGE;
	public static Building HEALTHSCIENCESBUILDING;
	public static Building ALUMNIHALL;
	public static UserData users;
	
	
	public static void main(String [] args) {
		
		getDefaultMap();
		//test user
		users = new UserData("1", "2");
		
		
		//Start the application by creating a loginFrame, passing in all the user data
		loginFRAME = new LoginPage(users.getLoginInfo());
		
		
	}
	
	/**
	 * function to Create and set the default buildings in the application, Middlesex college,
	 * Health Sciences Building, Alumni Hall
	 */
	
	public static void getDefaultMap() {
		
		/**
		 * Creating the middlesex college building
		 */
		Building middlesexCollege = new Building();
		middlesexCollege.numOfFloors = 5;
		middlesexCollege.buildingName = "Middlesex College";
		middlesexCollege.imageURL = "/MCimages/MC.png";
		
		/*
		 * Creating the five floors and setting images
		 */
		Floor mc1 = new Floor();
		mc1.floorNum = 1;
		mc1.imageURL = "/MCimages/MC-1.png";
		
		
		Floor mc2 = new Floor();
		mc1.floorNum = 2;
		mc2.imageURL = "/MCimages/MC-2.png";
		
		Floor mc3 = new Floor();
		mc1.floorNum = 3;
		mc1.imageURL = "/MCimages/MC-3.png";
		
		Floor mc4 = new Floor();
		mc1.floorNum = 4;
		mc1.imageURL = "/MCimages/MC-4.png";
		
		Floor mc5 = new Floor();
		mc1.floorNum = 5;
		mc1.imageURL = "/MCimages/MC-5.png";
		
		middlesexCollege.floors.add(mc1);
		middlesexCollege.floors.add(mc2);
		middlesexCollege.floors.add(mc1);
		middlesexCollege.floors.add(mc1);
		middlesexCollege.floors.add(mc1);
		
		/**
		 * Creating the health science building
		 */
		Building healthScienceBuilding = new Building();
		healthScienceBuilding.numOfFloors = 0;
		healthScienceBuilding.buildingName = "Health Sciences Building";
		healthScienceBuilding.imageURL = "/HSBimages/HSB.png";
		
		/*
		 * Creating the four floors and setting images
		 */
		Floor hsb1 = new Floor();
		hsb1.floorNum = 1;
		hsb1.imageURL = "/HSBimages/HSB-1.png";
		
		
		Floor hsb2 = new Floor();
		hsb2.floorNum = 2;
		hsb2.imageURL = "/HSBimages/HSB-2.png";
		
		Floor hsb3 = new Floor();
		hsb3.floorNum = 3;
		hsb3.imageURL = "/HSBimages/HSB-3.png";
		
		Floor hsb4 = new Floor();
		hsb4.floorNum = 4;
		hsb4.imageURL = "/HSBimages/HSB-4.png";
		
		healthScienceBuilding.addFloor(hsb1);
		healthScienceBuilding.addFloor(hsb2);
		healthScienceBuilding.addFloor(hsb3);
		healthScienceBuilding.addFloor(hsb4);
		
		/**
		 * Creating the alumni hall building
		 */
		Building alumniHall = new Building();
		alumniHall.numOfFloors = 0;
		alumniHall.buildingName = "Alumni Hall";
		alumniHall.imageURL = "/AHimages/AH.png";
		
		Floor ah1 = new Floor();
		ah1.floorNum = 1;
		ah1.imageURL = "/AHimages/AH-1.png";
		
		Floor ah2 = new Floor();
		ah2.floorNum = 2;
		ah2.imageURL = "/AHimages/AH-2.png";
		
		Floor ah3 = new Floor();
		ah3.floorNum = 3;
		ah3.imageURL = "/AHimages/AH-3.png";
		
		alumniHall.addFloor(ah1);
		alumniHall.addFloor(ah2);
		alumniHall.addFloor(ah3);
		
		/*
		 *  Set buildings to main methods static variables so they can be used by JFrames
		 */
		MIDDLESEXCOLLEGE = middlesexCollege;
		HEALTHSCIENCESBUILDING = healthScienceBuilding;
		ALUMNIHALL = alumniHall;
	}
}

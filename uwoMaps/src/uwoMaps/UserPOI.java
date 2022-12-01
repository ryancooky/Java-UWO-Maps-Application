package uwoMaps;

/**
 * @author Dayton Crombie, dcrombie@uwo.ca
 * @version 1.0
 * This class will be used to create user created POIs
 */

public class UserPOI extends POI{
	
	/*
	 * Allows the user the ability to set a description to their custom
	 * Point of Interest  
	 */
	private String description;
	
	/*
	 * X and Y positions that the Point of interest is located on
	 */
	public float xCoordinate;
	public float yCoordinate;

	/**
	 * Constructor that initializes instance variables for parent class
	 * 
	 * Variables for POI parent class:
	 * @param POIname - name of the point of interest
	 * @param floor - floor that the POI is associated with
	 * @param vis - whether or not the POI is visible on the map
	 * 
	 */
	public UserPOI(String POIname, String buildingName, Floor floor, Boolean vis) {
		super(POIname, buildingName, floor, vis);
	}
	
	/**
	 * Return the description of the User POI
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description of the User POI
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
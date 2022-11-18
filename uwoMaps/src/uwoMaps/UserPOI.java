package uwoMaps;

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
	public UserPOI(String POIname, Floor floor, Boolean vis) {
		super(POIname, floor, vis);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

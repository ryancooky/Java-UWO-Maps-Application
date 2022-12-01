package uwoMaps;

public class regularPOI extends POI{
	
	/*
	 * MetaData object associated with the built in point of interest,
	 * This is not a required instance variable for all regular POIs, 
	 * only for regularPOIs of the classroom category. 
	 */
	private MetaData metadata;
	
	/*
	 * The categories of the Built in POI can be classroom,
	 * navigation, washroom, CS, eateries, etc  
	 */
	private String category;
	/*
	 * The description is any extra details for the category: 
	 * navigation(stairwell, door, or elevator), CS(computer lab, 
	 * and collaborative room), washroom (male or female), etc
	 */
	private String description;
	
	/*
	 * X and Y positions on the floor that the Point of interest is located on
	 */
	public float posX;
	public float posY;
	
	
	/**
	 * Constructor that initializes instance variables for parent class
	 * 
	 * Variables for POI parent class:
	 * @param POIname - name of the point of interest
	 * @param floor - floor that the POI is associated with
	 * @param vis - whether or not the POI is visible on the map
	 * 
	 * Extra Variables: 
	 * @param cat - the category for the built in POI
	 */
	public regularPOI(String POIname, String buildingName, Floor floor, Boolean vis, String cat) {
		super(POIname, buildingName, floor, vis);
		category = cat;
	}

	public MetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}
	
	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String descrip) {
		this.description = descrip;
	}
	
}
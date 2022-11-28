package uwoMaps;

import java.util.LinkedList;

/**
 * @author Dayton Crombie, dcrombie@uwo.ca
 * @version 1.0
 * This class will be used to handle users favourite POIs
 */

public class Favourite {
	
	/**
	 * @param favPOIs - Linked list to store POI objects that user has favourited
	 */
	
	public LinkedList<POI> favPOIs = new LinkedList<POI>();
	

	/**
	 * Constructor
	 */
	public Favourite(LinkedList<POI> favPOIs) {
		this.favPOIs = favPOIs;
	}
	
	/**
	 * Add a POI to the list of users favourites
	 */
	public void mark(POI poi) {
		favPOIs.add(poi);
	}
	
	/**
	 * Remove a POI from the list of users favourites
	 */
	public void unmark(POI poi) {
		if (favPOIs.contains(poi)) {
			favPOIs.remove(poi);
		}
	}
	
	/**
	 * Returns an array of size 2 of the x and y coordinates of the POI taken in by the method
	 */
	public float[] showFav(POI poi) {
		if (poi instanceof regularPOI) {
			regularPOI isRegPOI = (regularPOI) poi;
			return new float[] {isRegPOI.posX, isRegPOI.posY};
		}
		else if (poi instanceof UserPOI) {
			UserPOI isUserPOI = (UserPOI) poi;
			return new float[] {isUserPOI.xCoordinate, isUserPOI.yCoordinate};
		}
		else {
			return null;
		}
	}
	
}

package uwoMaps;

public class CampusMap {
	private Building[] buildingList;
	private Building currentBuilding;
	
	public Building[] getBuildings() {
		return buildingList;
	}
	
	public void setBuilding(Building building) {
		currentBuilding = building;
	}
	
	public Building getCurrentBuilding() {
		return currentBuilding;
	}
}

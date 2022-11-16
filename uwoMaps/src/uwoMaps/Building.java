package uwoMaps;

public class Building {
	public String buildingName;
	public String buildingAddress;
	public Integer numOfFloors;
	public POI[] POIs;
	private Integer buildingPosX;
	private Integer buildingPosY;
	private Floor[] floors;
	
	public Building(String name, Integer posX, Integer posY) {
		buildingName = name;
		setPosX(posX);
		setPosY(posY);
	}

	public Integer getBuildingPosX() {
		return buildingPosX;
	}

	public void setPosX(Integer buildingPosX) {
		this.buildingPosX = buildingPosX;
	}

	public Integer getPosY() {
		return buildingPosY;
	}

	public void setPosY(Integer buildingPosY) {
		this.buildingPosY = buildingPosY;
	}
	
	public void setAddress(String address) {
		buildingAddress = address;
	}
	
}

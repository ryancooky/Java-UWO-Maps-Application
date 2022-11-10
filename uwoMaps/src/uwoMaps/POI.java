package uwoMaps;

public class POI extends TypePOI{

	private static final String TypeName = "POI";
	private static Boolean vis;
	private String poiName;
	private Integer roomNumber;
	public String searchLabel;
	private Short position;
	private TypePOI typePOI;
	private Boolean marked;
	
	public POI(String name, Integer roomNum, String searchlabel, Short pos) {
		super(TypeName, vis);
		// TODO Auto-generated constructor stub
		poiName = name;
		roomNumber = roomNum;
		searchLabel = searchlabel;
		setPosition(pos);
	}
	
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getPoiName() {
		return poiName;
	}
	
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}


	public Short getPosition() {
		return position;
	}


	public void setPosition(Short position) {
		this.position = position;
	}
	
	/*
	 * Do we need addPOI and editPOI? we can have getters and setters 
	 * instead in my opinion
	 * */
	
	public Boolean marked() {
		return marked;
	}
	
	
}

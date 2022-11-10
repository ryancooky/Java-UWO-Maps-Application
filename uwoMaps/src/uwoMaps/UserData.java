package uwoMaps;

public class UserData {
	private String id;
	private String password;
	private POI[] favPOIs;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public POI[] getFavPOIs() {
		return favPOIs;
	}
}

package uwoMaps;

public class UserData {
	private String id;
	private String password;
	private Favourite[] favs;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Favourite[] getFavPOIs() {
		return favs;
	}
}

package uwoMaps;

public class UserData {
	private String id;
	private String password;
	private Favourite[] favourites;
	private UserPOI[] customPOIs;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Favourite[] getFavPOIs() {
		return favourites;
	}
}

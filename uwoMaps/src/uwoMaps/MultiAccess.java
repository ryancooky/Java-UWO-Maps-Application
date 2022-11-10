package uwoMaps;

public class MultiAccess {
	private String id;
	private String password;
	private Boolean isLoggedIn;
	
	public MultiAccess(String user, String pass) {
		id = user;
		password = pass;
	}
	
	public void login(String user, String pass) {
		if (user == id && pass == password) {
			isLoggedIn = true;
		} else {
			
		}
	}
	
	public Boolean CheckLoginStatus() {
		return isLoggedIn;
	}
}

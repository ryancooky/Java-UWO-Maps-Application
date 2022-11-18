package uwoMaps;

import java.util.HashMap;

public class UserData {
	
	/*
	 * This class will use a hashmap implementation to store usernames
	 * and passwords, anytime the constructor is called, a new pair gets
	 * pushed onto the hashmap. 
	 */
	private HashMap<String, String> loginInfo = new HashMap<String,String>();
	
	
	private Favourite[] favourites;
	private UserPOI[] customPOIs;
	
	UserData(String id, String password){
		loginInfo.put(id, password);
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
	
	public Favourite[] getFavPOIs() {
		return favourites;
	}
}

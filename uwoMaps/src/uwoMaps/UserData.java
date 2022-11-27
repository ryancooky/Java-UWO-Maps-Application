package uwoMaps;

import java.util.HashMap;

public class UserData {
	
	/*
	 * This class will use a hashmap implementation to store usernames
	 * and passwords, anytime the constructor is called, a new pair gets
	 * pushed onto the hashmap. 
	 */
	private HashMap<String, String> loginInfo = new HashMap<String,String>();
	
	private HashMap<String, Favourite[]> favInfo = new HashMap<String, Favourite[]>();
	
	private HashMap<String, UserPOI[]> customPOIInfo = new HashMap<String, UserPOI[]>();
	
	public HashMap<String, Boolean> canEdit = new HashMap<String, Boolean>();
	

	UserData(String id, String password){
		loginInfo.put(id, password);
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
	
	public Favourite[] getFavs(String id) {
		return favInfo.get(id);
	}
	
	public UserPOI[] getCustomPOIs(String id) {
		return customPOIInfo.get(id);
	}
	
	public Boolean canUserEdit(String id) {
		return canEdit.get(id);
	}
	
}

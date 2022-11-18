package uwoMaps;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
	public static void main(String [] args) {
		
		//test user
		UserData user1 = new UserData("david", "uwo123");
		
		//test login frame
		LoginPage login = new LoginPage(user1.getLoginInfo());
		
	}
}

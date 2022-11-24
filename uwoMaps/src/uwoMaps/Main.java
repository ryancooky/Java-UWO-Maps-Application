package uwoMaps;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
	
	public static LoginPage loginFRAME;
	public static HomePage MFRAME;
	
	public static void main(String [] args) {
		
		//test user
		UserData user1 = new UserData("1", "2");
		
		//test login frame
		loginFRAME = new LoginPage(user1.getLoginInfo());
		
		
	}
}

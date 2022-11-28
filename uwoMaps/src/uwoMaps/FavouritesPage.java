package uwoMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FavouritesPage extends JFrame implements ActionListener{
	
	Favourite fav;
	String userName = Main.MFRAME.user;
	
	public FavouritesPage(){
		
		Favourite fav = Main.loginFRAME.userdata.getFavs(userName);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700,500);
		this.setVisible(true);
		this.setTitle("My Favourites");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

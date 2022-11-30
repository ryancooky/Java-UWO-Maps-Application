package uwoMaps;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import uwoMaps.Building;

public class FloorPage extends JFrame implements ActionListener{
	
	Building insideOf;
	Floor floor;
	
	private ImageIcon img;
	private JPanel background = new JPanel();

	public FloorPage(Building build, Floor f) {
		insideOf = build;
		floor = f;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(screenSize);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle(build.buildingName + " Floor " + f.floorNum);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

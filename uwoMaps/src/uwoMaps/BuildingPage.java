package uwoMaps;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BuildingPage extends JFrame implements ActionListener{

	
	
	Building building = new Building();
	
	int choice;
	int numFloors;
	
	JButton backButton = new JButton("Go Back");
	private ImageIcon icon;
	private JLabel iconLabel;
	
	JScrollPane j = new JScrollPane();
	
	public BuildingPage(Building build){
		Main.CMAP.setVisible(false);
		
		building = build;
		numFloors = build.numOfFloors;
		
		icon = new ImageIcon(this.getClass().getResource("/AHimages/AH-1.png")); 
		iconLabel = new JLabel(icon);
		iconLabel.setSize(600, 600);
		this.add(iconLabel);
		
		j.add(iconLabel);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(screenSize);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle(build.buildingName);
		
		backButton.addActionListener(this);
		backButton.setBounds(0, 0, 120, 40);
		
		this.add(backButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == backButton) {
			this.dispose();
			Main.CMAP.setVisible(true);
		}
	}

}

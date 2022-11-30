package uwoMaps;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uwoMaps.Building;

public class FloorPage extends JFrame implements ActionListener{
	
	Building insideOf;
	Floor floor;
	
	private ImageIcon img;
	private JPanel background = new JPanel();
	JButton backButton = new JButton("Go Back");
	JButton zoomInButton = new JButton("+");
	JButton zoomOutButton= new JButton("-");
	JComboBox viewChoice;

	public FloorPage(Building build, Floor f) {
		Main.BPAGE.setVisible(false);
		insideOf = build;
		floor = f;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(screenSize);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle(build.buildingName + " Floor " + f.floorNum);
		
		
		String[] options = {"POI View", "No washrooms", "Plain view"};
		viewChoice = new JComboBox(options);
		viewChoice.setBounds(getWidth() - 165, 20, 120, 60);
		viewChoice.addActionListener(this);
		
		img = new ImageIcon(getClass().getResource(f.imageURL));
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
		JLabel label = new JLabel(img, JLabel.CENTER);
		
		background.setBounds(0, 0, getWidth(), getHeight());
		
		backButton.addActionListener(this);
		backButton.setBounds(50, 35, 120, 40);
		backButton.setBackground(Color.yellow);
		
	    zoomInButton.addActionListener(this);
	    zoomInButton.setBounds(50, 75, 40, 40);
		
		zoomOutButton.addActionListener(this);
		zoomOutButton.setBounds(50, 115, 40, 40);
		
		label.add(backButton);
		label.add(zoomInButton);
		label.add(zoomOutButton);
		label.add(viewChoice);
		
		background.add(label);
		this.add(background);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == backButton) {
			this.dispose();
			Main.BPAGE.setVisible(true);
		}
		if (e.getSource() == viewChoice) {
			int index = viewChoice.getSelectedIndex();
			if (index == 0) {
				//Do nothing
			} else if (index == 1){
				//switch image of floor to the image with no bathrooms
			} else {
				//switch image to the plain image of the floor
			}
		}
	}

}

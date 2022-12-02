package uwoMaps;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	
	boolean isPinDropped; 
	int pinPointX;
	int pinPointY;
	
	private ImageIcon img;
	private ImageIcon pin;
	private JLabel floorMap;
	private JPanel background = new JPanel();
	JButton backButton = new JButton("Go back");
	JButton zoomInButton = new JButton("+");
	JButton zoomOutButton= new JButton("-");
	
	JButton listPOIsButton = new JButton("List all POIs");
	JButton createPOIButton = new JButton("Create Custom POI");
	JButton addToFavButton = new JButton("Add to Favourites");
	JComboBox viewChoice;

	public FloorPage(Building build, Floor f) {
		Main.BPAGE.setVisible(false);
		insideOf = build;
		floor = f;
		isPinDropped = false;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(screenSize);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle(build.buildingName + " Floor " + f.floorNum);
		
		
		String[] options = {"POI View", "No washrooms", "Plain view"};
		viewChoice = new JComboBox(options);
		viewChoice.setBounds(getWidth() - 140, 20, 120, 60);
		viewChoice.addActionListener(this);
		
		img = new ImageIcon(getClass().getResource(f.imageURL));
		img = new ImageIcon(img.getImage().getScaledInstance(getWidth() - 300, getHeight(), Image.SCALE_SMOOTH));
		floorMap = new JLabel(img, JLabel.CENTER);
		
		pin = new ImageIcon(getClass().getResource("/other/pin.png"));
		pin = new ImageIcon(pin.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JLabel pinLabel = new JLabel(pin, JLabel.CENTER);
		
		
		background.setBounds(0, 0, getWidth(), getHeight());
		
		backButton.addActionListener(this);
		backButton.setBounds(20, 20, 120, 40);
		backButton.setBackground(Color.yellow);
		
	    zoomInButton.addActionListener(this);
	    zoomInButton.setBounds(60, 65, 40, 40);
		
		zoomOutButton.addActionListener(this);
		zoomOutButton.setBounds(60, 110, 40, 40);
		 
		listPOIsButton.addActionListener(this);
		listPOIsButton.setBounds(getWidth() - 140, 150, 120, 40);
		
		createPOIButton.addActionListener(this);
		createPOIButton.setBounds(getWidth() - 140, 200, 140, 40);
		createPOIButton.setVisible(false);
		
		addToFavButton.addActionListener(this);
		addToFavButton.setBounds(getWidth() - 140, 250 , 140, 40);
		addToFavButton.setVisible(false);
		
		this.add(backButton);
		this.add(zoomInButton);
		this.add(zoomOutButton);
		this.add(viewChoice);
		this.add(listPOIsButton);
		this.add(createPOIButton);
		this.add(addToFavButton);
		
		background.add(floorMap);
		
		floorMap.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pinPointX = e.getX();
				pinPointY = e.getY();
				isPinDropped = true;
				pinLabel.setBounds(pinPointX, pinPointY, 10, 20);
				floorMap.add(pinLabel);
				createPOIButton.setVisible(true);
				addToFavButton.setVisible(true);
			}
		});
		
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

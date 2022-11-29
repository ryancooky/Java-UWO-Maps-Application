package uwoMaps;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class Background extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
 
    public Background(String image) {
        icon = new ImageIcon(image);
        icon = imageSetSize(icon, 700, 500);
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); 
                super.paintComponent(g);
            }
        };
       
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }
 
    ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image x = icon.getImage();  
		Image y = x.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon result = new ImageIcon(y); 
		return result;
	}
}

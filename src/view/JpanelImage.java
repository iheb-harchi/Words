package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JpanelImage extends JPanel {
	String path;
	public JpanelImage(String path) {
		this.path = path;
	}

	private static final long serialVersionUID = 1L;
	private BufferedImage img;
	
	  protected void paintComponent(Graphics g) {
		  try {
	            img = ImageIO.read(new File(path));
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
		  
          super.paintComponent(g);
          g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
      }
}

package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;



public class ImageMorph extends Polymorph {
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	private BufferedImage image;
	@Override
	public void draw(Graphics g) {
		//g.setColor(Color.yellow);
		
		try {                
		      image = ImageIO.read(this.getClass().getResourceAsStream("falls.jpg"));
		   } catch (IOException ex) {
			   ex.printStackTrace();
		   }
		//g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}
	
	public void update() {
		
	}
}

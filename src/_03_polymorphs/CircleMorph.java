package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		double angle = 0.0;
		//while(angle < 760) {
		setX((int) (getX() + Math.cos(angle) * 50));
		
		setY((int) (getY() + Math.sin(angle) * 50));
		angle += 0.1;
		//}
	}
}

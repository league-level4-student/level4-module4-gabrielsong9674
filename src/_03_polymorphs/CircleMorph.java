package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	double angle;
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect((int)(getX() + Math.cos(angle) * 50), (int)(getY() + Math.sin(angle) * 50), getWidth(), getHeight());
	}
	
	public void update() {
		angle+= .1;
	}
}

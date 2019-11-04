package fr.dauphine.ja.haouiliahmed.shapes.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.haouiliahmed.shapes.model.Circle;

public class CircleDrawer implements Drawer {
	private Circle circle;
	public CircleDrawer(Circle circle) {
		this.circle = circle;
	}
	public void draw(Graphics graphics) {
		int x = this.circle.getCenter().getX();
		int y = this.circle.getCenter().getY();
		int rayon = this.circle.getRayon();
		graphics.setColor(new Color(0,0,0));
		graphics.drawOval(x, y, rayon, rayon);
		
	}

}

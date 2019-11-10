package fr.dauphine.ja.haouiliahmed.shapes.view;

import java.awt.Graphics;


import fr.dauphine.ja.haouiliahmed.shapes.model.Point;

public class PointDrawer implements Drawer {
	private Point point;
	public PointDrawer(Point point) {
		this.point = point;
	}
	public void draw(Graphics graphics) {
	}

}

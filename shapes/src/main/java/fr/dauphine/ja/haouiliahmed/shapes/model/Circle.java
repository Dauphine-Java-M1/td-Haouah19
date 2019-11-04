package fr.dauphine.ja.haouiliahmed.shapes.model;

import java.util.ArrayList;

import fr.dauphine.ja.haouiliahmed.shapes.view.CircleDrawer;
import fr.dauphine.ja.haouiliahmed.shapes.view.Drawer;

public class Circle extends Shapes {
	private Point centre ; 
	private int rayon;
	
	public Circle (Point centre, int rayon ) {
		super.setDrawer(new CircleDrawer(this));
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public String toString() {
		return "("+this.centre +","+ this.rayon +","+this.surface()+")";
	}
	public void translate(int dx, int dy) {
		Point translateCenter = new Point(this.centre) ;
		translateCenter.translate(dx, dy);
		this.centre = translateCenter;
	}
	public Point getCenter() {
		return new Point(this.centre);
	}
	public int getRayon() {
		return this.rayon;
	}
	public double surface() {
		return Math.PI*this.rayon*this.rayon;
	}
	public boolean contains(Point p) {
		return p.getX()* p.getX()+ p.getY()+p.getY() == this.rayon*this.rayon ;
	}
	// J'utilise une ArrayList pour simuler la liste des points
	public boolean contains(Point p, ArrayList<Circle> circles ) {
		for (Circle c : circles ) {
			if( c.contains(p)) {
				return true;
			}
		}
		return false ;
	}

}

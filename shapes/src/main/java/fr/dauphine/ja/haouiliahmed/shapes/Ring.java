package fr.dauphine.ja.haouiliahmed.shapes;

import java.util.ArrayList;

public class Ring {
	private Point centre; 
	private int rayon;
	private int rayonInterne;
	
	public Ring(Point centre, int rayon, int rayonInterne) {
		if(rayon>rayonInterne) {
			this.centre = centre;
			this.rayon = rayon; 
			this.rayonInterne = rayonInterne;
		}else {
			System.out.println("Rayon < Rayon Interne");
		}
	}
	public boolean equals(Object o) {
		if(o==this)
			return true;
		if(! ( o instanceof Ring))
				return false;
		Ring r = (Ring) o;
		return  this.centre.isSameAs(r.centre) && this.rayon == r.rayon && this.rayonInterne == r.rayonInterne;
	}
	
	public String toString() {
		return "("+this.centre+","+this.rayon+","+this.rayonInterne+")";
	}
	public boolean contains(Point p) {
		ArrayList<Circle> cercles = new ArrayList<Circle>();
		
		Circle cercle = new Circle(this.centre, this.rayon);
		Circle cercleInterne = new Circle(this.centre, this.rayonInterne);
		
		cercles.add(cercle);
		cercles.add(cercleInterne);
		
		return cercle.contains(p, cercles);
	}
	
	public boolean contains(Point p, ArrayList<Ring> rings) {
		for (Ring r : rings) {
			if( r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String [] args) {
		
		Ring r1 = new Ring (new Point(0,0), 2, 1);
		Ring r2 = new Ring (new Point(0,0), 3, 1);
		
		System.out.println(r1);
		System.out.println(r1.equals(r2));
		
		System.out.println(r1.contains(new Point(0,2)));
		
		ArrayList<Ring> rings = new ArrayList<Ring>();
		rings.add(r1);
		rings.add(r2);
		
		System.out.println(r1.contains(new Point(0,2)));
	}
}

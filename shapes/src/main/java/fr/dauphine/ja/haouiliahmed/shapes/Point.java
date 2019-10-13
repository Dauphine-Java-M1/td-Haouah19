package fr.dauphine.ja.haouiliahmed.shapes;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	private static int compteur=0;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		this.compteur++;
	}
	public Point(Point y) {
		this.x = y.getX();
		this.y = y.getY();
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getCompteur() {
		return this.compteur;
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	public boolean isSameAs(Point n) {
		return (this.x== n.getX() && this.y == n.getY());
	}
	
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	public static void main (String [] args) {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1.isSameAs(p2));
		System.out.println(p1.isSameAs(p3));
		System.out.println(p2.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p1));
		System.out.println(list.indexOf(p3));
		
		// Translation 
		p1.translate(1, 1);
		System.out.println(p1);
	}
	
}

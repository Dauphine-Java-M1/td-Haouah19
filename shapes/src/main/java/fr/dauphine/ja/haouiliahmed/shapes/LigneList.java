package fr.dauphine.ja.haouiliahmed.shapes;

import java.util.LinkedList;
import java.util.List;

public class LigneList {
	private List<Point> points;

	public LigneList() {
		this.points = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		points.add(p);
	}
	public int pointCapacity() {
		// Capacity ne sert plus à rien, car avec une linkedList on ajoute à "l'infini"
		return points.size();
	}
	public int nbPoints() {
		return points.size();
	}
	public boolean contains(Point p) {
		return points.contains(p);
	}
	public static void main(String [] args) {
		Point p1=new Point(1,2);
		Point p2= new Point(1,2);
		Point p3 = new Point(3,4);
		LigneList l = new LigneList();
		l.add(p1);
		l.add(p2);
		System.out.println(l.contains(p1));
		System.out.println(l.contains(p3));
	}
}

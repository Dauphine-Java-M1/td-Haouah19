package fr.dauphine.ja.haouiliahmed.shapes.model;

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
}

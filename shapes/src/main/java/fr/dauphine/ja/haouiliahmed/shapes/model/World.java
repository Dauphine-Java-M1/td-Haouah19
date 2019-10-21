package fr.dauphine.ja.haouiliahmed.shapes.model;

import java.util.ArrayList;

public class World {
	private ArrayList<Shapes> shapes;
	public World(ArrayList<Shapes> shapes) {
		this.shapes = shapes;
	}
	public void addShape(Shapes shape) {
		shapes.add(shape);
	}
}

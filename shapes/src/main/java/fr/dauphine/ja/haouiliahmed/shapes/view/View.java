package fr.dauphine.ja.haouiliahmed.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.haouiliahmed.shapes.model.Circle;
import fr.dauphine.ja.haouiliahmed.shapes.model.Point;
import fr.dauphine.ja.haouiliahmed.shapes.model.Shapes;
import fr.dauphine.ja.haouiliahmed.shapes.model.World;

public class View extends JPanel {
	private World world;
	
	public View(World world) {
		this.world = world;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for(Shapes shape : this.world.getShapes()) {
			shape.getDrawer().draw(g);
		}
	}

	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		World world = new World();
		Circle circle = new Circle(new Point(200,200), 500);
		world.addShape(circle);
		View view = new View(world);
		
		frame.add(view);
		frame.setVisible(true);
	}
	
}

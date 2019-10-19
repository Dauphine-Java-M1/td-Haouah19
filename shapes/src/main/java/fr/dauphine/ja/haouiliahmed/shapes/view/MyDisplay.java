package fr.dauphine.ja.haouiliahmed.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
	    g.drawLine(0, 0, width, height);
	}
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
		frame.setVisible(true);
	}
	
}

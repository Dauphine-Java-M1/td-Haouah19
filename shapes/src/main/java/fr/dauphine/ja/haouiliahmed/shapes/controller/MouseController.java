package fr.dauphine.ja.haouiliahmed.shapes.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.haouiliahmed.shapes.view.MyDisplay;

public class MouseController implements MouseMotionListener{
	private MyDisplay myDisplay;
	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getClass();
		System.out.println(e.getPoint().x);
		System.out.println(e.getPoint().y);
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

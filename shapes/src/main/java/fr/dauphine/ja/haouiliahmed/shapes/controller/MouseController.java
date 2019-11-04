package fr.dauphine.ja.haouiliahmed.shapes.controller;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.haouiliahmed.shapes.view.View;

public class MouseController implements MouseMotionListener{
	private View view;
	
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

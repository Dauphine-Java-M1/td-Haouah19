package fr.dauphine.ja.haouiliahmed.iterables.src;

import java.util.Iterator;

public class PanelIterator implements Iterator<Integer>{
	private int debut;
	private int fin;
	
	public PanelIterator(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	}
	public boolean hasNext() {
		if(debut <= fin)
			return true;
		return false;
	}

	public Integer next() {
		if(hasNext())
			return debut++ ;
		return null;
	}

}

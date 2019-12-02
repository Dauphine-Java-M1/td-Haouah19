package fr.dauphine.ja.haouiliahmed.iterables.src;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel {
	public static Iterator<Integer> panel1(final int lb, final int ob){
		if(lb>ob)
			throw new IllegalArgumentException();
		return new Iterator<Integer>() {
			private int debut = lb;
			private int fin = ob;
			
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
		};
	}
	
	public static Iterable<Integer> panel2(final int debut, final int fin){
		return new Iterable<Integer>() {
			public Iterator<Integer> iterator() {
				return panel1(debut,fin);
			}	
		};
	}
	
	public static List<Integer> panel(final int debut, final int fin){
		if(debut>fin)
			throw new IllegalArgumentException();
		return new AbstractList<Integer>() {
			@Override
			public Integer get(int index) {
				if(debut+index<=fin)
					return debut+index;
				return null;
			}
			@Override
			public int size() {
				return fin-debut+1;
			}
			
		};
	}
	
	public static void main(String [] args) {
		Iterator<Integer> it=panel1(2,5);
		for(;it.hasNext();)
			System.out.println(it.next()); // affiche 1 2 3 4 5
	}
}

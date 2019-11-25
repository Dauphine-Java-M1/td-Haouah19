package fr.dauphine.ja.haouiliahmed.iterables.src;

import java.util.AbstractSequentialList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Mult {

	public static List<Integer> multCopy(int coefficient, List<Integer> entiers){
		List<Integer> tmp = new ArrayList<Integer>();
		for(Integer entier : entiers) {
			tmp.add(entier*coefficient);
		}
		return tmp;
	}
	
	public static List<Integer> mult(final int coefficient, final List<Integer> entiers){
		
		if(entiers instanceof RandomAccess) {
				return new AbstractList<Integer>() {
					@Override
					public Integer get(int index) {
						return entiers.get(index)*coefficient;
					}
					@Override
					public int size() {
						return entiers.size();
					}
					@Override 
					public List<Integer> subList(int fromIndex,int toIndex){
						return entiers.subList(fromIndex, toIndex);
					}
				};
		}else {
				return new AbstractSequentialList<Integer>() {
					@Override
					public ListIterator<Integer> listIterator(final int index) {
						return new ListIterator<Integer>() {
							private ListIterator<Integer> list = entiers.listIterator(index) ;
							@Override
							public boolean hasNext() {
								return list.hasNext();
							}
	
							@Override
							public Integer next() {
								return list.next()*coefficient;
							}
	
							@Override
							public boolean hasPrevious() {
								return list.hasPrevious();
							}
	
							@Override
							public Integer previous() {
								return list.previous()*coefficient;
							}
	
							@Override
							public int nextIndex() {
								return list.nextIndex();
							}
	
							@Override
							public int previousIndex() {
								return list.previousIndex();
							}
	
							@Override
							public void remove() {
								throw new UnsupportedOperationException();
							}
	
							@Override
							public void set(Integer e) {
								throw new UnsupportedOperationException();
							}
	
							@Override
							public void add(Integer e) {
								throw new UnsupportedOperationException();
							}
						};
					}
					@Override
					public int size() {
						return entiers.size();
					}
					
				};
		}

	}
	
	public static void main(String [] args) {
		// ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println("Avec l'ArrayList: "+(System.nanoTime() - t0));
		
		// LinkedList
		LinkedList<Integer> ll = new LinkedList<>();

		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println("Avec la LinkedList: "+(System.nanoTime() - t0));
	}
}

package fr.dauphine.ja.haouiliahmed.iterables.src;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mult {

	// façon numero UNO :
	public static List<Integer> multCopy(int coefficient, List<Integer> entiers){
		List<Integer> tmp = new ArrayList<Integer>();
		for(Integer entier : entiers) {
			tmp.add(entier*coefficient);
		}
		return tmp;
	}
	
	public static List<Integer> mult(final int coefficient, final List<Integer> entiers){
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
		
		/** Question 4 (Vérification avec le prof)
		return new AbstractSequentialList<Integer>() {
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
			@Override
			public ListIterator<Integer> listIterator(int index) {
				return entiers.listIterator(index);
			}
		};
		*/
	}
	
	
	public static void main(String [] args) {
		// ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
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

		for (int i = 0; i < 100; i++) {
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

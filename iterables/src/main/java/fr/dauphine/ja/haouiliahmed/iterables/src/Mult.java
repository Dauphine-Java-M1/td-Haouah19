package fr.dauphine.ja.haouiliahmed.iterables.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mult {

	// façon numero UNO :
	public static List<Integer> mult(int coefficient, List<Integer> entiers){
		List<Integer> tmp = new ArrayList<Integer>();
		for(Integer entier : entiers) {
			tmp.add(entier*coefficient);
		}
		return tmp;
	}
	
	public static void main(String [] args) {
		// Test : mult
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(Mult.mult(2, list));
		
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);}long t0 = System.nanoTime();
			List<Integer> ret = Mult.mult(2, al);
			long sum=0;
			for(int val : ret) {
				sum+=val/2;
			}
			System.out.println((System.nanoTime() - t0));
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
			System.out.println((System.nanoTime() - t0));
	}
}

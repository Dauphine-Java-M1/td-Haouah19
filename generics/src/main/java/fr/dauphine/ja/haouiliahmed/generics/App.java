package fr.dauphine.ja.haouiliahmed.generics;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list=Arrays.asList(1, 2);
    	// sprint(list);
    	
    	List<String> list2 = Arrays.asList("aba","baa");
    	printLength(list2);
    }
    
    
    private static void print(List<?> list) {
    	for(Object o:list)
    		System.out.println(o);
    }

    private static <T extends CharSequence> void printLength(List<T> sequence) {
    	for(T ob : sequence) {
    		System.out.println(ob.length());
    	}
    }
    
    public static <T extends Comparable<T>> T myMax(T a, T... b ) {
    	T max = a;
    	for(T object : b) {
    		if(max.compareTo(object)<0)
    			max = object;
    	}
    	return max;
    }
}

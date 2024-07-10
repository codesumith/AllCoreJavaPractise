package com.sumith.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<String> t1 =new TreeSet<>();
		t1.add("Orange");
		t1.add("Mango");
		t1.add("Pear");
		t1.add("Banana");
		t1.add("Apple");
		
		System.out.println("Ascending order");
		t1.forEach(str -> System.out.println(str));
		
		TreeSet<String> t2 =new TreeSet<>();
		t2.add("Orange");
		t2.add("Mango");
		t2.add("Pear");
		t2.add("Banana");
		t2.add("Apple");
		
		System.out.println("Desending order");
		
		Iterator<String> itr =t2.descendingIterator();
		
		itr.forEachRemaining(str -> System.out.println(str));

	}

}

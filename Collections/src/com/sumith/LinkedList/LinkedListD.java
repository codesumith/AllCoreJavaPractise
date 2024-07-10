package com.sumith.LinkedList;

import java.util.LinkedList;

public class LinkedListD {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("Item 2");
		ll.add("Item 3");
		ll.add("Item 4");
		ll.add("Item 5");
		ll.add("Item 6");
		ll.add("Item 7");
		ll.add("Item 9");
		
		ll.add(0,"Item 0");
		ll.add(1,"Item 1");
		ll.add(8,"Item 8");
		ll.add(9,"Item 10");
		
		System.out.println(ll);
		
		ll.remove("Item 5");
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.set(0, "Ajay");
		ll.set(1, "Vijay");
		ll.set(2, "Anand");
		ll.set(3, "Aman");
		ll.set(4, "Suresh");
		ll.forEach(x-> System.out.println(x));
		
	}
}

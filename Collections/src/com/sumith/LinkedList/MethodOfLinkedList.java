package com.sumith.LinkedList;

import java.util.LinkedList;

public class MethodOfLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		
		ll.addFirst("Ravi");
		ll.add("Rahul");
		ll.addLast("Anand");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}

package com.sumithTestNov4;


import java.util.LinkedList;

public class Link {
	
	public static void main(String[] args) {
		
		LinkedList<String> l=  new LinkedList<>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		
		
		System.out.println("Orginal Linked list :"+l);
		
		l.addFirst("White");
		l.addLast("Pink");
		
		System.out.println("Final linked list :"+l);
	}

}

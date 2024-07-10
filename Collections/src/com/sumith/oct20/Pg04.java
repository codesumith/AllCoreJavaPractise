package com.sumith.oct20;

import java.util.LinkedList;
import java.util.List;

public class Pg04 {

	public static void main(String[] args) {
		
		List<String> l=new LinkedList<>();
		l.add("Red");
		l.add("Green");
		l.add("Black");
		
		System.out.println("Original linked list: "+l);
		l.add(0, "Pink");
		System.out.println("Final linked list: "+l);

	}

}
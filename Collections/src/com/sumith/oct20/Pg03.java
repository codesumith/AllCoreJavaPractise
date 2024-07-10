package com.sumith.oct20;

import java.util.LinkedList;
import java.util.List;

public class Pg03 {

	public static void main(String[] args) {
		
		List<String> l=new LinkedList<>();
		l.add("Red");
		l.add("Green");
		l.add("Black");
		
		System.out.println("Before Adding first and last  : "+l);
		l.add(0, "White");
		l.add("Pink");
		System.out.println("After Adding first and last  : "+l);
	}
}

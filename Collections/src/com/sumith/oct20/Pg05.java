package com.sumith.oct20;

import java.util.ArrayList;
import java.util.List;

public class Pg05 {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		
		System.out.println("Original linked list: "+l);
		l.clear();
		System.out.println("Final linked list: "+l);

	}

}

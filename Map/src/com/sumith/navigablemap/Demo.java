package com.sumith.navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> nm=new TreeMap<>();
		nm.put(1, "Red");
		nm.put(2, "Green");
		nm.put(3, "Yellow");
		nm.put(4, "blue");
		nm.put(5, "Pink");
		
		System.out.println(nm);
		
		System.out.println("First key : "+nm.firstKey());
		System.out.println("Last key : "+nm.lastKey());
		System.out.println("First entry : "+nm.firstEntry());
		System.out.println("Last entry : "+nm.lastEntry());
		System.out.println("Head map : "+nm.headMap(3));
		System.out.println("Tail map : "+nm.tailMap(3));

	}

}

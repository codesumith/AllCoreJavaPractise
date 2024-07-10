package com.sumith.sotedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		SortedMap<Integer,String> map =new TreeMap<>();
		map.put(100, "Amit");
		map.put(101, "Ravi");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		
		System.out.println("First key :"+map.firstKey());//100
		System.out.println("Lasy key :"+map.lastKey());//103
		System.out.println("Head map :"+map.headMap(102));//100 = Amit ,101 = Ravi
		System.out.println("Tail map :"+map.tailMap(102));//102= vijay, 103 = Rahul
		System.out.println("Sub map :"+map.subMap(100, 102));//100=amit,101=Ravi

		

	}

}

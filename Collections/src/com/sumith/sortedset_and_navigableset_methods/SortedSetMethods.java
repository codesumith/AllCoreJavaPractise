package com.sumith.sortedset_and_navigableset_methods;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethods {

	public static void main(String[] args) {
		
		TreeSet<Integer> times = new TreeSet<>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1600);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		
		SortedSet<Integer> sub =new TreeSet<>();
		
		sub=times.subSet(1545, 2100);
		System.out.println(sub);
		System.out.println(sub.first());
		System.out.println(sub.last());
		
		sub=times.headSet(1545);
		System.out.println("Using HeadSet :-"+sub);
		
		sub= times.tailSet(1545);
		System.out.println("Using TailSet :-"+sub);


	}

}

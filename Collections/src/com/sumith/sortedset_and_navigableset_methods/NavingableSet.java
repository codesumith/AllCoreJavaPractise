package com.sumith.sortedset_and_navigableset_methods;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavingableSet {

	public static void main(String[] args) {
		
		NavigableSet<Integer> ns=new TreeSet<>();
		
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		ns.add(7);
		ns.add(8);
		
		System.out.println("lower(3) :"+ns.lower(3));
		
		System.out.println("floor(3) :"+ns.floor(3));
		
		System.out.println("higher(3):"+ns.higher(3));
		
		System.out.println("celing(3) :"+ns.ceiling(3));
	}

}

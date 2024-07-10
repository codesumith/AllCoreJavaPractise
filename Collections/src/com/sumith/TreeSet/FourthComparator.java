package com.sumith.TreeSet;

import java.util.Comparator;

public class FourthComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return -(e1.age.compareTo(e2.age));
	}
	
}

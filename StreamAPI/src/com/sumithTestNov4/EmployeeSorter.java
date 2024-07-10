package com.sumithTestNov4;

import java.util.Comparator;


public class EmployeeSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.firstname.compareTo(o2.firstname);
	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return 
//	}

}

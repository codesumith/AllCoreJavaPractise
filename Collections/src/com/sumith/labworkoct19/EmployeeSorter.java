package com.sumith.labworkoct19;

import java.util.Comparator;

public class EmployeeSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getFirstName().compareTo(e2.getFirstName());
	}

	

}

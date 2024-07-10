package com.sumith.labworkoct19;

import java.util.Set;
import java.util.TreeSet;

public class Testing {
	
	public static void main(String[] args) {
		Set<Employee> tr= new TreeSet<>(new EmployeeSorter());
		
		tr.add(new Employee("raj","Kumar"));
		tr.add(new Employee("Arjun","Reddy"));
		tr.add(new Employee("Harish","Rao"));
		
		tr.forEach(emp->System.out.println(emp));


	}

}

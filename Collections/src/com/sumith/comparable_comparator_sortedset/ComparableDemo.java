package com.sumith.comparable_comparator_sortedset;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
ArrayList<Employee> empData =new ArrayList<Employee>();

empData.add(new Employee(104,"Arjun",1200.00));
empData.add(new Employee(103,"John",3456.00));

Collections.sort(empData);

empData.forEach(emp -> System.out.println(emp));
	}

}

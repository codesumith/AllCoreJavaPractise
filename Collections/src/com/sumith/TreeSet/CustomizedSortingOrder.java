package com.sumith.TreeSet;

import java.util.*;

public class CustomizedSortingOrder {

	public static void main(String[] args) {
		
		System.out.println("Sorting Name -> Ascending Order\n");
		
		
		
		TreeSet<Employee> ts1= new TreeSet<>(new FirstComparator());
		
		ts1.add(new Employee(101,"Zaheer",24));
		ts1.add(new Employee(102,"Ayan",19));
		ts1.add(new Employee(103,"Pooja",26));
		ts1.forEach(emp -> System.out.println(emp));
		
		System.out.println("-------------------------------------");

		System.out.println("Sorting Name -> Descending Order\n");
		
		TreeSet<Employee> ts2= new TreeSet<>(new SecondComparator());
		
		ts2.add(new Employee(101,"Zaheer",24));
		ts2.add(new Employee(102,"Ayan",19));
		ts2.add(new Employee(103,"Pooja",26));
		ts2.forEach(emp -> System.out.println(emp));
		
		System.out.println("-------------------------------------");
		
        System.out.println("Sorting Age -> Ascending Order\n");
		
		TreeSet<Employee> ts3= new TreeSet<>(new ThirdComparator());
		
		ts3.add(new Employee(101,"Zaheer",24));
		ts3.add(new Employee(102,"Ayan",19));
		ts3.add(new Employee(103,"Pooja",26));
		ts3.forEach(emp -> System.out.println(emp));
		
		System.out.println("-------------------------------------");
		
        System.out.println("Sorting Age -> Descending Order\n");
		
		TreeSet<Employee> ts4= new TreeSet<>(new FourthComparator());
		
		ts4.add(new Employee(101,"Zaheer",24));
		ts4.add(new Employee(102,"Ayan",19));
		ts4.add(new Employee(103,"Pooja",26));
		ts4.forEach(emp -> System.out.println(emp));
		
		System.out.println("-------------------------------------");
		
	}

}

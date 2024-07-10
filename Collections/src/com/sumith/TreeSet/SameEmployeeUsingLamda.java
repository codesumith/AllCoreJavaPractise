package com.sumith.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class SameEmployeeUsingLamda {

	public static void main(String[] args) {
	
		System.out.println("Soting Name -> Ascending order\n");
		
		Comparator<Employee> c1=(e1,e2) -> e1.name.compareTo(e2.name);
		
		TreeSet<Employee> ts1=new TreeSet<>(c1);
		
		ts1.add(new Employee(101,"Car",10));
		ts1.add(new Employee(103,"Accenture",50));
		ts1.add(new Employee(102,"Google",45));

		ts1.forEach(emp -> System.out.println(emp));
		
		System.out.println("--------------------------------------------");
		
        System.out.println("Soting Name -> Descending order\n");
		
		Comparator<Employee> c2=(e1,e2) -> -(e1.name.compareTo(e2.name));
		
		TreeSet<Employee> ts2=new TreeSet<>(c2);
		
		ts2.add(new Employee(101,"Car",10));
		ts2.add(new Employee(103,"Accenture",50));
		ts2.add(new Employee(102,"Google",45));

		ts2.forEach(emp -> System.out.println(emp));
		
		System.out.println("--------------------------------------------");
		
        System.out.println("Soting Age -> Ascending order\n");
		
		Comparator<Employee> c3=(e1,e2) -> e1.age.compareTo(e2.age);
		
		TreeSet<Employee> ts3=new TreeSet<>(c3);
		
		ts3.add(new Employee(101,"Car",10));
		ts3.add(new Employee(103,"Accenture",50));
		ts3.add(new Employee(102,"Google",45));

		ts3.forEach(emp -> System.out.println(emp));
		
		System.out.println("--------------------------------------------");
		
        System.out.println("Soting Age -> Descending order\n");
		
		Comparator<Employee> c4=(e1,e2) -> -(e1.age.compareTo(e2.age));
		
		TreeSet<Employee> ts4=new TreeSet<>(c4);
		
		ts4.add(new Employee(101,"Car",10));
		ts4.add(new Employee(103,"Accenture",50));
		ts4.add(new Employee(102,"Google",45));

		ts4.forEach(emp -> System.out.println(emp));
		
		System.out.println("--------------------------------------------");
		
        System.out.println("Soting ID -> Ascending order\n");
		
		Comparator<Employee> c5=(e1,e2) -> e1.id.compareTo(e2.id);
		
		TreeSet<Employee> ts5=new TreeSet<>(c5);
		
		ts5.add(new Employee(101,"Car",10));
		ts5.add(new Employee(103,"Accenture",50));
		ts5.add(new Employee(102,"Google",45));

		ts5.forEach(emp -> System.out.println(emp));
		
		System.out.println("--------------------------------------------");
		
        System.out.println("Soting ID -> Descending order\n");
		
		Comparator<Employee> c6=(e1,e2) -> -(e1.id.compareTo(e2.id));
		
		TreeSet<Employee> ts6=new TreeSet<>(c6);
		
		ts6.add(new Employee(101,"Car",10));
		ts6.add(new Employee(103,"Accenture",50));
		ts6.add(new Employee(102,"Google",45));

		ts6.forEach(emp -> System.out.println(emp));
		
		System.out.println("--------------------------------------------");
	}

}

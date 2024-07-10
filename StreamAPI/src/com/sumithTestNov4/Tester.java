package com.sumithTestNov4;


import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> s=new  TreeSet<Employee>(new EmployeeSorter());
		
Employee e1=new Employee("Rohith","Sharma");
Employee e2=new Employee("Anil","Sharma");

s.add(e1);
s.add(e2);


System.out.println(s);

	}

}

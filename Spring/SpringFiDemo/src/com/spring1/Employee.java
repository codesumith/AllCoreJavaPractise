package com.spring1;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	public Employee()
	{
		System.out.println("Employee is created");
	}
	
	public void printEmp()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee empName : "+empName);
		System.out.println("Employee salary : "+salary);
		
	}

}

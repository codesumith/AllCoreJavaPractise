package com.sumith.emp_july21;

import java.util.Scanner;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public static Employee getEmployeeObject() {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter employee Id:");
		int id=sc.nextInt();
		
		System.out.print("Enter employee Name:");
		String Name=sc.nextLine();
		Name=sc.nextLine();
		
		System.out.print("Enter employee salary:");
		double sal =sc.nextDouble();
		
		Employee emp=new Employee(id,Name,sal);
		
		sc.close();// it should be in comment if you want to run loop;
		
		return emp;
		
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	
}
	
	

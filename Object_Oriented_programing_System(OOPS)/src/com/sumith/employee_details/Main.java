package com.sumith.employee_details;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Employee(111,"raj");
		e1.setEmployeeName("Raj kumar");
		e1.setEmployeeId(222);
		System.out.println(e1);
		
		Manager m=new Manager(e1);
		System.out.println(m);
		
		

	}

}

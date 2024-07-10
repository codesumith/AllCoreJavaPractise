package com.sumith.heap_stack;

public class Employee {
	
	int id =100;
	

	public static void main(String[] args) {
		
		
		int val=200;
		
		Employee e1=new Employee();
		
		e1.id=val;
		
		update(e1);
		
		System.out.println(e1.id);//900
		
		
		Employee e2 =new Employee();
		
		e2.id=500;
		
		switchEmployees(e2,e1);
		
		
		System.out.println(e1.id);//900
		
		System.out.println(e2.id);//900
			
	}
public static void update(Employee e) {
	e.id=900;
	e=new Employee();
	e.id=400;
}

public static void switchEmployees(Employee e1,Employee e2) {
	                               // e2         e1
	
	int temp=e1.id;//3000x
	
	e1.id=e2.id;//1000x
	
	e2=new Employee();
	e2.id=temp;
}
}

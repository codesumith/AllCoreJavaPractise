package com.sumith.nov11test;

import java.util.ArrayList;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		
		
		
		List<Employee> l2 =new ArrayList<>();
		
		l2.add(new Employee("arjun","Hyderabad"));
		l2.add(new Employee("arun","Hyderabad"));
		l2.add(new Employee("guna","Mumbai"));
		
		int j=0;
		
	 for(Employee e : l2)
	 {
		 if(e.getCity()=="Hyderabad")
		 {
			 System.out.println("In Hyderabd there is "+e.getName()+" Employees");
			 j++;
		 }
	 }
	 
	System.out.println("In Hyderabd there are "+j+" Employees");
	}

}

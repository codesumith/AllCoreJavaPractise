package com.sumith.labwork_Programs_oct18;


import java.util.Set;
import java.util.TreeSet;

public class Testing {
	
	public static void main(String[] args) {
		
		Set<Employee> st=new TreeSet<>(new EmployeeSorter());
		st.add(new Employee(1,"Manoj","Manager"));
		st.add(new Employee(2,"Anil","Sales"));
		st.add(new Employee(3,"Ganesh","Hr"));
		st.add(new Employee(4,"Arjun","Desiner"));
		
		st.forEach(emp -> System.out.println(emp));


	}

}

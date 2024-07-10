package com.sumith.labwork_nov1st;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Pg1 {
	
	
	public static String Desig(Double sal)
	{
		if(sal ==30000)
			return "Manager";
		
		else if(sal<30000&&sal>=25000)
			return "SR Developer";
		
		else if (sal<25000&&sal>=10000)
			return "JR Developer";
		
		else 
			return "Trainee"; 
	}

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter how many employee details you want to enter :");
		int noEmployees =Integer.parseInt(s.nextLine());
		List<Employee> l =new ArrayList<Employee>();
		
		while(l.size()<=noEmployees)
		{
			System.out.println("Enter empID :");
			int id =Integer.parseInt(s.nextLine());
			
			System.out.println("Enter empName :");
			String name = s.nextLine();
			
			System.out.println("Enter empSalary :");
			double sal =Double.parseDouble(s.nextLine());
			
			Employee e =new Employee(id,name,sal);
			
			l.add(e);
			
		}
		
		Predicate<Employee> p = emp -> emp.Salary<=30000;
		
		
		
		l.forEach(x ->
		{
			if(p.test(x)) {
				System.out.println(x+"Designation :"+Pg1.Desig(x.getSalary()));
			}
		});
		
		s.close();
		
	}
	
}

package com.sumith.serialization_and_Deserialization_Program1;

import java.io.*;
import java.util.Date;

@SuppressWarnings("serial")
public class Employee implements Serializable  
{
	
	
	private int id;
	private String name;
	private float salary;
	private Date date;
	
	public Employee(int id, String name, float salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}
	
	public static Employee getData() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter emp id :");
		int id=Integer.parseInt(br.readLine());
		
		System.out.print("Enter emp name :");
		String name=br.readLine();
		
		System.out.print("Enter your salary :");
		float sal =Float.parseFloat(br.readLine());
		
		Date d=new Date();
		
		Employee e= new Employee(id,name,sal,d);
		
		return e;
		
	}
	
}
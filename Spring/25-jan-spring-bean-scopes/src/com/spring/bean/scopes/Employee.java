package com.spring.bean.scopes;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	

	public Employee() {
		System.out.println("Employye is created");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}

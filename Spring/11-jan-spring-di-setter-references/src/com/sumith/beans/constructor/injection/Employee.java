package com.sumith.beans.constructor.injection;

public class Employee {

	private int id;
	private String name;
	private double salary;

	// 3 params

	public Employee(int id, String name, double salary) {
		super();
		System.out.println("Employee parameterized constructor invoked");
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	  System.out.println("Employye setSalary() method");
		this.salary = salary;
	}

}

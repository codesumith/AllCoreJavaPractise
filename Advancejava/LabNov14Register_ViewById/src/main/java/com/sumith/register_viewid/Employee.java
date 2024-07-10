package com.sumith.register_viewid;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	
	private String id;
	private String name;
	private double salary;
	private String address;
	
	public Employee() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}

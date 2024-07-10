package com.sumith.payraoll_aug7th;

public class Employee {
	
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}




	public double calculateGrossSalary() {
		double grossSalary=basicSalary+HRAPer+DAPer;
		
		return grossSalary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + ", GrossSalary" + calculateGrossSalary() + "]";
	}

	
}

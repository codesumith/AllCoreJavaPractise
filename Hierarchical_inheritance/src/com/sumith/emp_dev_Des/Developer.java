package com.sumith.emp_dev_Des;

public class Developer extends Employee {
	
	public Developer(double sal) {
		
		this.salary=sal;
	}

	@Override
	public String toString() {
		return "Developer [salary=" + salary + "]";
	}

	

	
}

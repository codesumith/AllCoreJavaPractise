package com.sumith.emp_dev_Des;

public class Designer extends Employee {
	
	
	public Designer(double sal) {
		
		this.salary=sal;
		
	}

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	}

	
}

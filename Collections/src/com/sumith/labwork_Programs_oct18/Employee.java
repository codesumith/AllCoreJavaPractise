package com.sumith.labwork_Programs_oct18;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String designation;
	
	public Employee(int employeeId, String firstName, String designation) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.designation = designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", designation=" + designation + "]";
	}
	
	

}

package com.sumith.supplier_Employee;

import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private Date doj;
	
public Employee(int employeeId,String employeeName,Date doj) {
	super();
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.doj=doj;
	
}

public String toString() {
	return "[ Employee Id = "+employeeId+",EmployeeName = "+employeeName+", Date of joining : "+doj+"]";
}
}

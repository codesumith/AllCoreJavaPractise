package com.sumith.arraylist_can_hold_custom_objects;

public class EmployeeBLC {

	private Integer employeeId;
	private String  employeeName;
	private Double  employeeSalary;
	
	
	public EmployeeBLC() 
	{
		super();
		
	}
	
	public EmployeeBLC(Integer employeeId, String employeeName, Double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeeBLC [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	
	
	

}

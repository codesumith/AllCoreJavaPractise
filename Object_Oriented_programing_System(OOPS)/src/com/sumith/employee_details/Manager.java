package com.sumith.employee_details;

public class Manager {
	
	private int managerId;
	private String managerName;
	
	public Manager(Employee emp) {
		managerId=emp.getEmployeeId();
		managerName=emp.getEmployeeName();
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
	
	

}

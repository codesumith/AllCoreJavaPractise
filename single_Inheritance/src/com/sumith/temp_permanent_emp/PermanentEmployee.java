package com.sumith.temp_permanent_emp;

public class PermanentEmployee extends TemporaryEmployee{
	
	
	protected String department;
	protected String designation;
	

	public void acceptData(int emo, String nam, String addr, double sal, String dept,String desig) {
		
		employeeNumber=emo;
		 employeeName=nam;
		 employeeAddress=addr;
		 employeeSalary=sal;
		 department=dept;
		 designation=desig;
		
	}


	@Override
	public String toString() {
		return "PermanentEmployee [department=" + department + ", designation=" + designation + ", employeeNumber="
				+ employeeNumber + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress
				+ ", employeeSalary=" + employeeSalary + "]";
	}
	
	
}

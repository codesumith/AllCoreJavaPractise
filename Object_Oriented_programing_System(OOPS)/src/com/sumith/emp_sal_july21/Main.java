package com.sumith.emp_sal_july21;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee(111,"virat",10000);
		
		
		 String Name=emp.getEmployeeName();
		 System.out.println("EmployeeName:"+Name);
		 
	     int num=emp.getEmployeeNumber();
		 System.out.println("EmployeeID:"+num);
		 
		 double sal=emp.getEmployeeSalary();
		 System.out.println("EmployeeSalary:"+sal);
		 
		
		 
		 if(emp.getEmployeeSalary()>=90000) {
			System.out.println("EmpolyeeRole:Developer");
		}
		else if (emp.getEmployeeSalary()>=60000) {
			System.out.println("EmpolyeeRole:Designer");
		}
		else  {
			System.out.println("EmpolyeeRole:Tester");
		}

	}	

}

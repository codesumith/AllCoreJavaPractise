package com.sumith.comparable_comparator_sortedset;

public class Employee implements Comparable<Employee>
{

		private Integer employeeId;
		private String employeeName;
		private Double salary ;
		
		public Employee(Integer employeeId, String employeeName, Double salary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
		}

		
		
		//Sorted based on employee Id    
		
		@Override
		public int  compareTo(Employee emp) 
		{
			return this.employeeId-emp.employeeId;
		}
		
	

}

package com.sumith.employee_constructor_method_enum_aug3;


class Employee {

	//Declare Instances Variable
	
	  private String name;
	  private int employeeId;
	  private double salary;
	  
	  public Employee() {
			
		}

		public Employee(String name, int empId, double salary) {
				//Initialize Instance Variable
			this.name=name;
			this.employeeId=empId;
			this.salary=salary;
		}
		//Define Getters And Setters Methods
	  public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		

		@Override
		public String toString() {
			return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
		}

		

	}
	enum ManagerType {
	//Define Objects
		HR,SALES;
		
	}



	
	
	
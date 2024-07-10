package com.sumith.employee_constructor_method_enum_aug3;

//import com.sumith.batch23.Employee.ManagerType;

class Manager extends Employee{

	//Declare Instances Variable
		
		  private ManagerType type;
	int count;
		  
		  public Manager() {
			    //Initialize Instance Variable
			}
			
			public Manager(String name, int employeeId, double salary,ManagerType type) {
			//Initialize Instance Variable
				super (name,employeeId,salary);
				
				this.type=type;
			}
			// Define Getter and Setters Methods
		public ManagerType getType() {
			return type;
		}

		public void setType(ManagerType type) {
			this.type = type;
		}

		
		@Override
		public void setSalary(double salary) {
		// Write Logic Here
			count++;
			if(count==1) {
			if(type==ManagerType.HR) {
				super.setSalary(salary+10000);
			}
			else {
				super.setSalary(salary+5000);
			}
			}
			else {
				System.out.println("!!!!---You are already calimed---!!!");
			}
	}
		@Override
		public String toString() {
			return "Manager [type=" + type + "]";
		}
}
package com.sumith.employee_constructor_method_enum_aug3;

//Clerk

	class Clerk extends Employee {
	//Declare Instances Variable
		int speed;
		int accuracy;
		int count=0;
		
		
		
		public Clerk() {
		     //Initialize Instance Variable
		}

		public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
				 //Initialize Instance Variable
			this.setName(name);
			this.setEmployeeId(employeeId);
			this.setSalary(salary);
			this.speed=speed;
			this.accuracy=accuracy;
		}

		
	//Define Getter and Setters Methods

		

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public int getAccuracy() {
			return accuracy;
		}

		public void setAccuracy(int accuracy) {
			this.accuracy = accuracy;
		}
		
		
		@Override
		public void setSalary(double salary) {
			//Write Logic Here
			count++;
			if(count==1) {

			if(speed>70&&accuracy>80) {
				super.setSalary(salary+1000);
			
			}
			}
			else {
				System.out.println("!!!!---You are already calimed---!!!");
			}
	}
	}
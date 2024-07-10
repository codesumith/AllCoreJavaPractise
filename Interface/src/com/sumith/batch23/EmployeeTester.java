package com.sumith.batch23;

import com.sumith.batch23.Employee.ManagerType;

class Employee{
	private String name;
	private int EmployeeId;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		EmployeeId = employeeId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", EmployeeId=" + EmployeeId + ", salary=" + salary + "]";
	}

	 enum ManagerType{
		HR,Sales;
		
	}
	
}

class Manager extends Employee{
	private  ManagerType type;
	int count;
	
	public Manager() {super();}

	

	public Manager(String name, int employeeId, double salary, ManagerType type) {
		super(name, employeeId, salary);
		this.type = type;
	}



	public ManagerType getType() {
		return type;
	}



	public void setType(ManagerType type) {
		this.type = type;
	}

@Override
public void setSalary(double salary) {
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
	return "Manager [name=" + super.getName() + ", EmployeeId= " + super.getEmployeeId() + ", salary= " + super.getSalary() +" Role=" + type + "]";
}

	
	
	
}

class Clerk extends Employee{
	
	int speed;
	int accuracy;
	int count=0;
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
	
	public Clerk() {super();}
	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}
	@Override
	public void setSalary(double salary) {
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
	@Override
	public String toString() {
		return "Clerk [name=" + super.getName() + ", EmployeeId= " + super.getEmployeeId() + ", salary= " + super.getSalary() +", Typing speed= "+speed+", Typing accuracy= "+accuracy+ "]";
	}
	
}
public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("john", 123, 10000);
		System.out.println(e);
		System.out.println( "-----------------------------------------------------------------------");
		System.out.println( "-----------------------------------------------------------------------");
        Manager m =new Manager("Anand", 111, 55000,ManagerType.HR);
        System.out.println(m);
        m.setSalary(m.getSalary());
        System.out.println(m);
        m.setSalary(m.getSalary());
        System.out.println( "-----------------------------------------------------------------------");
        System.out.println( "-----------------------------------------------------------------------");
        Manager m1=new Manager("Sai", 444, 45000, ManagerType.Sales);
        System.out.println(m1);
        m1.setSalary(m1.getSalary());
        System.out.println(m1);
        m1.setSalary(m1.getSalary());
		System.out.println( "-----------------------------------------------------------------------");
		System.out.println( "-----------------------------------------------------------------------");
		Clerk c=new Clerk("Vijay", 121, 25000, 71, 81);
		System.out.println(c);
		c.setSalary(c.getSalary());
		System.out.println(c);
		c.setSalary(c.getSalary());
		System.out.println( "-----------------------------------------------------------------------");
		System.out.println( "-----------------------------------------------------------------------");
		
	}

}

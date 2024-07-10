package com.sumith.employee.copy_constructor;

public class ELC {

	public static void main(String[] args) {
		
          Employee details=new Employee("sai teja",22,250000,"Developer");
          details.raiseSalary(10);
          Employee d1= new Employee(details);
          System.out.println(details);
          d1.setName("Akhil");
          d1.setAge(22);
          d1.setSalary(150000);
          System.out.println(d1);
          Employee d2 =new Employee(details);
          d2.setName("venkatesh");
          d2.setDepartment("Admin");
          System.out.println(d2);
          
	}

}

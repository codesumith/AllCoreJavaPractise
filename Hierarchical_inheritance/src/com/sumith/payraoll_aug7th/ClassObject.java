package com.sumith.payraoll_aug7th;

public class ClassObject {

	public static void main(String[] args) {
		
		Taxutil tu=new Taxutil();
		
		Employee e1=new Employee(121, "anil", 15000, 10000, 6000);
		System.out.println(e1);
		System.out.println("Salary= "+e1.calculateGrossSalary());
		System.out.println("Tax apllicable on gross salary is: "+tu.calculateTax(e1));
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Manager m1= new Manager(123, "Mohan", 25000, 20000, 7000, 10000);
		System.out.println(m1);
		System.out.println("Salary= "+m1.calculateGrossSalary());
		System.out.println("Tax apllicable on gross salary is: "+tu.calculateTax(m1));
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Trainer t1=new Trainer(234, "kiran", 35000, 22000, 8000, 3, 20000);
		System.out.println(t1);
		System.out.println("Salary= "+t1.calculateGrossSalary());
        System.out.println("Tax apllicable on gross salary is: "+tu.calculateTax(t1));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        
        Sourcing s1=new Sourcing(444, "Gopal", 45000, 33000, 12000, 100, 75, 35);
        System.out.println(s1);
        System.out.println("Salary= "+s1.calculateGrossSalary());
        System.out.println("Tax apllicable on gross salary is: "+tu.calculateTax(s1));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

	}

}

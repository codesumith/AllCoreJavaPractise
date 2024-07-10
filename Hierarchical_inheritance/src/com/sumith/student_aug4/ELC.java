package com.sumith.student_aug4;

public class ELC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(123, "John Smith", 10000);
		System.out.println(s.displayDetails());
		System.out.println("Reamining Amount"+s.payFee(6000));
		
		DayScholar d= new DayScholar(121, "Smith", 10000, 2000);
		System.out.println(d.displayDetails());
		System.out.println("Reamining Amount"+d.payFee(10000));
		
		Hosteller h =new Hosteller(131, "Anil", 10000, 5000);
		System.out.println(h.displayDetails());
		System.out.println("Reamining Amount"+h.payFee(12000));
		
		
		

	}

}

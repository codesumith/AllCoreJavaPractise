package com.sumith.car_details;

public class Main {

	public static void main(String[] args) {
		Driver d=new Driver("anil", 34);
		
		Car c= new Car("Hundai","Eon",2015,d);
		Car c1=new Car(c);
		System.out.println(c);
		System.out.println(c1);
		Car c2=new Car(c);
		Driver d1 = new Driver("Sam",45);
		c2.changeDriver(d1);
		
		//c2.changeDriver("vimal");
		System.out.println(c2);
	    
		
		

	}

}

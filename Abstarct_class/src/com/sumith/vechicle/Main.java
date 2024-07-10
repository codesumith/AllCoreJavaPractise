package com.sumith.vechicle;

public class Main {

	public static void main(String[] args) {
		
		Vechicle v;
		v=new Car();v.run();v.horn();v.digitalMeter();
		
        System.out.println("-------------------------------------------------------");

        v=new Bike();v.run();v.horn();v.digitalMeter();

	}

}

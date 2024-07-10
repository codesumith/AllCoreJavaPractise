package com.sumith.vechicle;

public class Bike implements Vechicle{

	@Override
	public void run() {
		System.out.println("Bike is running");
		
	}

	@Override
	public void horn() {
		System.out.println("Bike having horn");
		
	}

	@Override
	public void digitalMeter() {
		System.out.println("Bike does not have digital meter but implementation is compulsory");
		
	}
	
	

}

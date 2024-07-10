package com.sumith.vechicle;

public class Car implements Vechicle{

	@Override
	public void run() {
		System.out.println("Car is running");
		
	}

	@Override
	public void horn() {
		System.out.println("Car having horn");
		
	}

	@Override
	public void digitalMeter() {
		System.out.println("Car having Digital Meter");
		
	}

}

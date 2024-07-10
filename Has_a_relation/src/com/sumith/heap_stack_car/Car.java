package com.sumith.heap_stack_car;

abstract class Car {
	
	int speed=100;
	public Car()
	{
		
		System.out.println("Car class constructor!!!");
		
	}

	
	public void getDetails() {
		
		System.out.println("It has 1 engine and 4 wheels");
		
	}
	
	public abstract void run();
}

package com.sumith.functional_interface_lambda;

public class Lambda1 {

	public static void main(String[] args) {
		
    Moveable car=() -> System.out.println("Moving with car...");

    car.move();
    
    Moveable bike=() -> System.out.println("Bike is moving");
    
    bike.move();
    
    Moveable bus= () -> System.out.println("Bus is moving");

    bus.move();
    
    Moveable auto =()-> System.out.println("auto is moving");
	
    auto.move();
	}

}

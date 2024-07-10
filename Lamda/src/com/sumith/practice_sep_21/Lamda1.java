package com.sumith.practice_sep_21;
@FunctionalInterface
interface Moveable
{
	void move();  //SAM Single abstract method
}

public class Lamda1 {

	public static void main(String[] args) {
		Moveable car= () -> System.out.println("Moving with car...");
		
		car.move();
		
		Moveable bike =() -> System.out.println("Moving with bike...");
		
		bike.move();
		
		Moveable bus = () -> System.out.println("Moving with bus...");
		
		bus.move();

	}

}

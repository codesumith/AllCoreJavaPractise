package com.sumith.static_method_ex2;

public class StaticMethod implements Vechicle {

	public static void main(String[] args) {
		
		Vechicle.move();
		//move(); //error

		//StaticMethod.move();//error
		
		//StaticMethod sm=new StaticMethod();//heap memory
		//sm.move;//error
	}

}

package com.sumith.multiple_inheritance_using_default;

public class Implementer implements I1, I2 {

	@Override
	public void m1() {
		
		I1.super.m1();
		I2.super.m1();
		System.out.println("Overriden Method of implementer class");
	}

}

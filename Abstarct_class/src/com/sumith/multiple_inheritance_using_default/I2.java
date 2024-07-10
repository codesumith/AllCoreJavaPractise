package com.sumith.multiple_inheritance_using_default;

public interface I2 {
	
	default void m1() {
		
		System.out.println("Default Method of I2 interface");
	}

}

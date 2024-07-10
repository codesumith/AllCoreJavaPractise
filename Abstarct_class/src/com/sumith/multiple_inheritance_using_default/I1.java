package com.sumith.multiple_inheritance_using_default;

public interface I1 {
	
	default void m1() {
		System.out.println("Default method of I1 interface");
	}

}

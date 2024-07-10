package com.sumith.super_class_methodcalling;

public class Sub extends Super{
	
	public void show() {
		super.show();
		
		System.out.println("sub class method executed");
		
		super.show();
	}

}

package com.sumith.single_level_inheritance;

public class B extends A {
	
	
	public void showData() {
		
		System.out.println("a value is:"+x);
		System.out.println("b value is:"+y);
		
	}
	
	public void dosum() {
		
		int result= x+y;
		System.out.println("Addition is:"+result);
		
	}
	
	public void prod() {
		
		int mul=x*y;
		System.out.println("Product is:"+mul);
	}

}

package com.sumith.Client.H.W;

public class Developer implements Client {

	@Override
	public void sum(int a, int b) {
		
		System.out.println("Addition of a&b is: "+(a+b));
		

	}

	@Override
	public void sub(int c, int d) {
		
		System.out.println("Subtraction of c&d is : "+(c-d));
		

	}

	@Override
	public void mul(int e, int f) {
		
        System.out.println("Product of e&f is : "+(e*f));
        
	}

}

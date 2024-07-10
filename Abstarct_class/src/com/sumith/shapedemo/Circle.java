package com.sumith.shapedemo;

public class Circle implements Shape{
	
	private final double PI=3.14;
	private int radius;

	@Override
	public void input() {
		System.out.print("Enter the radius of the Circle : ");
		radius=sc.nextInt();
		
	}

	@Override
	public void area() {
	double area =PI*radius*radius;
	System.out.println("Area of the Circle : "+area);
		
	}

}

package com.sumith.shapedemo;

public class Square implements Shape{
	
	private int side;

	@Override
	public void input() {
		System.out.print("Enter the side of the Square : ");
		side =sc.nextInt();
		
	}

	@Override
	public void area() {
		double area=side*side;
		
	 System.out.println("The area of Square : "+area);
		
	}

}

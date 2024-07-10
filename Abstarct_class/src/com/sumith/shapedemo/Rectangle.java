package com.sumith.shapedemo;

public class Rectangle implements Shape{
	
	private int length,breadth;

	@Override
	public void input() {
		System.out.print("Enter length of Reactangle : ");
		length = sc.nextInt();
		
		System.out.print("Enter breadth of Reactangle : ");
		breadth=sc.nextInt();
	}

	@Override
	public void area() {
		
		double area=length*breadth;
		System.out.println("The area of the Rectangle : "+area);
	
		
	}
	
	

}

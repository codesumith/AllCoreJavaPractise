package com.sumith.shape2;

public class Circle extends Shape{

	
	 double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return 3.14*radius*radius;
	}

	@Override
	public String printDetails() {
		
		return "Circle [Radius ="+radius+" Area of Circle is :"+getArea()+" ]";
	}
	 
	 
}

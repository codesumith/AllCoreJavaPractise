package com.sumith.shape2;

public class Rectangle extends Shape{

	
	double length;
	double breadth;
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double getArea() {
		
		return length*breadth;
	}


	@Override
	public String printDetails() {
	
		return "Rectangle [Length ="+length+", Breadth ="+breadth+", Area of Rectangle="+getArea()+"]";
	}
	
	
}

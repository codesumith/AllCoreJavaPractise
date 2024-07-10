package com.sumith.shape2;

public class Triangle extends Shape{
	
	double base;
	double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return (base*height)/2;
	}

	@Override
	public String printDetails() {
		
		return "Triangle[Base = "+base+",Height ="+height+"Area of Triangle ="+getArea()+"]";
	}
	
	

}

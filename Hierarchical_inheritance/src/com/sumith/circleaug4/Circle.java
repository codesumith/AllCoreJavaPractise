package com.sumith.circleaug4;

public class Circle {

	double radius;

	public Circle() {
		
	}

	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	public double getArea() {
		
		if(radius<0) {
			return -1;
		}
		else {
			return 3.14*radius*radius;
		}
		
	}
}

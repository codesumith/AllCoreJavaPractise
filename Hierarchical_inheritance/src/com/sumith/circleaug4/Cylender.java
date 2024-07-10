package com.sumith.circleaug4;

public class Cylender extends Circle {
	
	double height;

	public Cylender() {
		
	}

	public Cylender(double radius,double height) {
		super.radius=radius;
		this.height = height;
	}
	 
	public double getVolume() {
		
		if(height<0) {
			return -1;
		}
		else {
			return 3.14*(radius*radius)*(height);
		}
	}
	

}

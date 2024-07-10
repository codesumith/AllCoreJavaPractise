package com.sumith.areas_of_shapes_aug11;

public class Cuboid extends Rectangle{
	
	double height;

	protected double getHeight() {
		return height;
	}

	protected void setHeight(double height) {
		this.height = height;
	}
	
public double computeArea(double length,double width,double height) {
	
	return area=2*(length*width+width*height+length*height);
	
	
}



public Cuboid() {
	
	this.height=15;
}

public void show() {
	
	System.out.println( "Cuboid [height=" + height + ", width=" + width + ", length=" + length + ", Area of cuboid is : " + area + "]");
}
}

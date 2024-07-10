package com.sumith.areas_of_shapes_aug11;

public class Rectangle extends GeometricShape{
	
	double width;
	double length;
	protected double getWidth() {
		return width;
	}
	protected void setWidth(double width) {
		this.width = width;
	}
	protected double getLength() {
		return length;
	}
	protected void setLength(double length) {
		this.length = length;
	}
	
 
 public Rectangle() {
	 this.width=10;
	 this.length=10;
 }
@Override
 public double computeArea(double length,double width) {
		area=length*width;
		return area;
	}
	@Override
 public void show() {
		
		System.out.println( "Rectangle [width=" + width + ", length=" + length + ", Area of Rectangle is : " + area+ "]");
	}
 }
	

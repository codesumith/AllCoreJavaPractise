package com.sumith.areas_of_shapes_aug11;

public class GeometricShape {
	
	 String shapeType;
	 double area ;
	
	public double computeArea(double length,double width) {
		area= length*width;
		return area;
		
	}
public void show() {
	System.out.println("Area of "+shapeType+" is :"+area);
	
}

public GeometricShape() {
	this.shapeType="Geometric shape";
	this.area=0;
		
}


}

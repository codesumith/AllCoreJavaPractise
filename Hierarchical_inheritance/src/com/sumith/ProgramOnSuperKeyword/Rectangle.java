package com.sumith.ProgramOnSuperKeyword;

import java.text.DecimalFormat;

class Shap{
	
	protected int x;
	 
	Shap(int x){
		this.x=x;
		System.out.println("X value is:"+x);
		
	}
}

class Circle extends Shap{
	
	final double PI =3.14;
	
	Circle(int radius){
		
		super(radius);
		
	}
	
	public double areaOfCircle() {
		
		double area =PI*x*x;
		return area;
	}
}

class Rect extends Shap{
	int breadth;
	
	Rect(int length ,int breadth){
		super(length);
		this.breadth=breadth;
	}
	
	public void areaOfRectangle() {
		
		double area=x*breadth;
		System.out.println("Area of Rectangle:"+area);
		
	}
}

public class Rectangle {

	private static double areaOfCircle;

	public static void main(String[] args) {
		
		Circle c=new Circle(6);
		areaOfCircle = c.areaOfCircle();
		DecimalFormat df=new DecimalFormat("000.000");
		System.out.println("Area Of Circle is:"+df.format(areaOfCircle));
		
		Rect r=new Rect(4, 5);
		r.areaOfRectangle();

	}

}

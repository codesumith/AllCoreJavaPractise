package com.sumith.circle;

public class Area_And_Circumference {
	
	final double pi=3.14;
	public void areaOfCircle(int radius) {
		
		
		double area=pi*radius*radius;
		System.out.println("Area of the circle is:"+area);
		
		
		
	
	}
	
	
	
	public void circumference(int radius) {
		
		double cf=2*pi*radius;
		System.out.println("Circumference Of cirlce is:"+(int)cf);
		
		
	}
	

}

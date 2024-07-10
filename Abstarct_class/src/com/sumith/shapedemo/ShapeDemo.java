package com.sumith.shapedemo;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape s1;
		
		s1=new Rectangle();s1.input();s1.area();
		s1=new Square(); s1.input(); s1.area();
		s1=new Circle(); s1.input(); s1.area();
	}

}

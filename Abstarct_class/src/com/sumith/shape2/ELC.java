package com.sumith.shape2;

public class ELC {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(30.4, 45.4);
		System.out.println(r.printDetails());
		
		Circle c=new Circle(23.2);
		System.out.println(c.printDetails());
		
		Triangle t=new Triangle(146.2, 40.0);
		System.out.println(t.printDetails());
	}
}

package com.sumith.Shape.aug11;



public class Shape {

	public static Shape randsShape() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return new Circle();
		case 1:
			return new Trainagle();
		case 2:
			return new Square();
		default: {
			System.out.println("Shape is  default");
			return new Shape();
		}
		}

	}

	public Shape() {

	}

	public void draw() {
		System.out.println("Shape Draw");
	}

	public void erase() {
		System.out.println("Shape Erase");
	}
}

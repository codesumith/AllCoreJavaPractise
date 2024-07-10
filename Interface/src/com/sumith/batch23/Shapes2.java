package com.sumith.batch23;

class Shape{
	
	public static Shape randShape() {
		
		switch ((int) (Math.random()*3)) {
		case 0: return new Circle();
		case 1: return new Triangle();
		case 2: return new Square();
		default: System.out.println("Shape has Default");
		return new Shape();
		}
		
		
	}
	
	public Shape() {super();}
	
	
	public void draw()
	{
		System.out.println("Shape Draw");
	}
	
	public void erase()
	{
		System.out.println("Shape Erase");
	}
}
 
class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}

	@Override
	public void erase() {
		System.out.println("Circle Erase");
		
	}
	
}


class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Triangle Draw");
	}

	@Override
	public void erase() {
		System.out.println("Triangle Erase");
		
	}
	
}


class Square extends Shape{

	@Override
	public void draw() {
		System.out.println("Square Draw");
	}

	@Override
	public void erase() {
		System.out.println("Square Erase");
		
	}
	
}

public class Shapes2 {
	
	
		public static void main(String[] args) {
			
			Shape s=Shape.randShape();
			s.draw();
			s.erase();
			
			
		}
		
	

}

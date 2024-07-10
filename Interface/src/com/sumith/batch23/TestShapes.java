package com.sumith.batch23;

class GeometricShape{
	
	String shapeType;
    double area;
    
    
    
    public GeometricShape() {
		super();
	}
    
    public double computeArea(double a,double b) {
    	
    	return area;
    }
	
    public void show(){
    	
    	
    }

	
}


class Rectangle extends GeometricShape{
	
	double width;
	double length;
	
	public Rectangle() {
		super();
		this.width = 10;
		this.length = 10;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double computeArea(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println( "Rectangle[ Length ="+length+" Width ="+width+" Area of Rectangle is "+this.computeArea(width, length)+"]");
	}
	
	
	
}


class Cuboid extends Rectangle{
	
	double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double computeArea(double h, double l,double w) {
		double area=(2*((l*w)+(w*h)+(h*l)));
		return area;
	}

	public double computeArea() {
		super.area=super.width*this.height;
		return super.area;
	}
	public Cuboid() {
		super();
		this.height = 15;
	}

	@Override
	public void show() {
		System.out.println("Cuboid[ Height ="+height+" Width ="+width+" Length ="+length+" Area of Cuboid is "+this.computeArea(height,length,width)+"]");
	}
	
	
}
public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		r.show();
		System.out.println("_--------------------------------");
		Cuboid c=new Cuboid();
		c.show();
	}

}

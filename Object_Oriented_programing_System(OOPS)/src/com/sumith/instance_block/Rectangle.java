package com.sumith.instance_block;

public class Rectangle {
	
	private int width;
	private int height;
	
	{
		width=0;
		height=0;
	}

	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

public int getArea() {        
	 return	 width*height;
	 }

public int getPerimeter() {
	return 2*(width+height);	
}
		
		
		
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(5, 10);
		System.out.println("Area of Rectangle is:"+r.getArea());
		System.out.println("Parameter of Rectangle is:"+r.getPerimeter());

	}

}

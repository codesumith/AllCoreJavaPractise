package com.sumith.classnotes;

public class Test3 {
	
	enum Color{
		
		RED,BLUE
		
	}
	
	public static void main(String[] args) {
		
		Color c1= Color.RED;
		Color c2= Color.BLUE;
		
		if(c1==c2) {
			System.out.println("==");
		}
		
		if(c1.equals(c2)) {
			System.out.println("Equals");
		}
	}

}

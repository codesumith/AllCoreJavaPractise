package com.sumith.sep6th_labwork;

public class ArrayIndexOutOFBoundsExceptionDemo {
	public void checkException() {
		try {
			int a[]=new int[50];
			a[6]=20;
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array out of Bounds");
			
		}
	}
	

	public static void main(String[] args) {
		
		var ai=new ArrayIndexOutOFBoundsExceptionDemo();
		ai.checkException();
	}

}

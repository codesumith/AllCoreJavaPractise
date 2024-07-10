package com.sumith.sep6th_labwork;

public class MultiplecatchStatments {

	public void multiCatch() {
		int a[]=new int [2];
		
		try {
			a[4]=10/0;
		}
		catch(NumberFormatException|ArithmeticException|ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		
		var v=new MultiplecatchStatments();
		 
		v.multiCatch();

	}

}

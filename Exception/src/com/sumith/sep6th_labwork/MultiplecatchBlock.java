package com.sumith.sep6th_labwork;

public class MultiplecatchBlock {
	
	public void multiCatch() {
		int a[]=new int [2];
		
		try {
			a[4]=10/2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		var v=new MultiplecatchBlock();
		 
		v.multiCatch();

	}

}

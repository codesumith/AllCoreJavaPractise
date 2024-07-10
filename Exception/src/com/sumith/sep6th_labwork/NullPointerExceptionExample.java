package com.sumith.sep6th_labwork;

public class NullPointerExceptionExample {
	
	public void checkException() {
		try {
//			String str=null;
//			System.out.println(str.length());
		}
		catch(NullPointerException ne) {
			System.out.println("Null pointer exception");
		}
	}

	public static void main(String[] args) {
		var np=new NullPointerExceptionExample();
		np.checkException();
	}
}

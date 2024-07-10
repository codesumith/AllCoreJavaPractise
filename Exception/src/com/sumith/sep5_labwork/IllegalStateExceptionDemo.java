package com.sumith.sep5_labwork;

public class IllegalStateExceptionDemo {
	
	static void throwIllegalException() {
		try {
			throw new IllegalStateException("MyException");
		}
		catch(IllegalStateException objA) {
			System.out.println("Caught : "+objA);
		}
	}

	public static void main(String[] args) {
		
		throwIllegalException();

	}

}

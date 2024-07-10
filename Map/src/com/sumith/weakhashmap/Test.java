package com.sumith.weakhashmap;

public class Test {

	@Override
	public String toString() {
		return "Test Nit";
	}
	
	public void finalize()//called automatically if object is eligible for gc
	{
		System.out.println("finalize method is called");
	}
	

}

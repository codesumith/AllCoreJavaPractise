package com.sumith.super_class_variable;

public class Son extends  Father{
	
	
	protected double balance =16000;
	
	public Son()
	{
		
		System.out.println("Son balance:"+balance);
		System.out.println("Father balance:"+super.balance);
		
	}

}

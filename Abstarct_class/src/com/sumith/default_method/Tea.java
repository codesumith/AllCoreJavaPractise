package com.sumith.default_method;

public class Tea implements HotDrink {

	@Override
	public void prepare() {
		
System.out.println("Preparing Tea");
	}
	
	@Override
public  void expressPrepare() {
		
		System.out.println("Preparing premium Tea");
	}

}

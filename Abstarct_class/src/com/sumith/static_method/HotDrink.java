package com.sumith.static_method;

public interface HotDrink {

	void prepare();
	
	public static void expressPrepare() {
		
		System.out.println("Prepare without sugar");
		
	}
	
}

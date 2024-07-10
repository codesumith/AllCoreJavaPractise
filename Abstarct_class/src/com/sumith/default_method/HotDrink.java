package com.sumith.default_method;

public interface HotDrink {
	
	void prepare();

	default void expressPrepare()     
	{
        System.out.println("Preparing with premium");
	}	

}

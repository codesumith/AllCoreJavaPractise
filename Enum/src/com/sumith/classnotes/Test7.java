package com.sumith.classnotes;

public class Test7 {
	
	enum Season{
		
		SPRING,SUMMER,WINTER,FALL,RAINY
		
	}

	public static void main(String[] args) 
	{
	
		Season [] s1=Season.values();
		
		for(Season x:s1) {
			System.out.println(x);
		}
		
	}
}

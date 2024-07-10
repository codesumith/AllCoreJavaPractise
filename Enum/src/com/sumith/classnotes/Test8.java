package com.sumith.classnotes;

public class Test8 {
	
	static enum Season{
		
		SPRING,SUMMER,WINTER,FALL
	}
	
	public static void main(String[] args) {
		
		Season [] s1 =Season.values();
		
		for(Season x: s1) {
			System.out.println(x+" order is : "+x.ordinal());
		}
	}

}

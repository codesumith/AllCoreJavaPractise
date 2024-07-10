package com.sumith.string_and_its_method_related_pg;

public class GetBytesMethod {

	public static void main(String[] args) {
		
		String str= "ABCDEF";
		
		byte [] b=str.getBytes();
		
		for(byte a:b)
		{
			System.out.println(a);
		}
	}

}

package com.sumith.stringbuffer_stringbuilder;

public class String_StringBuffer_Stringbuilder_Comparsion {

	public static void main(String[] args) {
	
		StringBuilder sb1= new StringBuilder("HI");
		sb1.append(" Sumith");
		System.out.println(sb1);
		StringBuffer sb2= new StringBuffer("Data");
		sb2.append("Base");
		System.out.println(sb2);
		
		String sb3=new String ("Data");
		sb3.concat("Base");
		System.out.println(sb3);
	}

}

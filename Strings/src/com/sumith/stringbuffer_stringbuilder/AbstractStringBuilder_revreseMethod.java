package com.sumith.stringbuffer_stringbuilder;

public class AbstractStringBuilder_revreseMethod {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Hello");
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.reverse();
		System.out.println(sb2);
		
	}

}

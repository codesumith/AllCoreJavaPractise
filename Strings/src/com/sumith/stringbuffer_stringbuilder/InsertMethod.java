package com.sumith.stringbuffer_stringbuilder;

public class InsertMethod {

	public static void main(String[] args) {
		
StringBuffer sb1=new StringBuffer("Hello");
sb1.insert(1, "Java");
System.out.println(sb1);

StringBuilder sb2=new StringBuilder("Hello");
sb2.insert(2, "Java");
System.out.println(sb2);
	}

}

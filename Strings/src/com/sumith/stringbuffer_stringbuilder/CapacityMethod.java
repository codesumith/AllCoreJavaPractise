package com.sumith.stringbuffer_stringbuilder;

public class CapacityMethod {

	public static void main(String[] args) {
		
      StringBuffer sb1=new StringBuffer();
      System.out.println(sb1.capacity());
      
      StringBuffer sb2=new StringBuffer("India");
      System.out.println(sb2.capacity());
      
      sb2.append("is great. It is in Asia.");
      System.out.println(sb2.capacity());
      
      
      
	}

}

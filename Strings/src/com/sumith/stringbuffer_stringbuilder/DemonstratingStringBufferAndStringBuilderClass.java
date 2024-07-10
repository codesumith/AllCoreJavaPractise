package com.sumith.stringbuffer_stringbuilder;

public class DemonstratingStringBufferAndStringBuilderClass {

	public static void main(String[] args) {
		
		long startTime =System.currentTimeMillis();
		
		// String buffer to perform some looping operations
		StringBuffer sb1=new StringBuffer("Java");

		for(int i=0;i<=1000000;i++) {
			sb1.append(" Technology");
		}
		
		long endTime =System.currentTimeMillis();
		
		System.out.println("Time taken by stringBuffer class is :"+(endTime-startTime+" ms"));
		
		System.out.println("---------------------------------------------");
		
		
		long startTime1=System.currentTimeMillis();
		
		//String builder to perform some looping operations.
		StringBuilder sb2=new StringBuilder("Java");
		
		for(int i=0;i<=1000000;i++)
		{
			sb2.append(" Technology");
		}
		
		long endTime1=System.currentTimeMillis();
		
		System.out.println("Time taken by String builder class is :"+(endTime1-startTime1)+" ms");
	}

}

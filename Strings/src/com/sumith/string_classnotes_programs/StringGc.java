package com.sumith.string_classnotes_programs;

public class StringGc {

	public static void main(String[] args) throws InterruptedException {
		
		String str ="india";
		System.out.println(str.hashCode());
		
		str =null;
		System.gc();
		
		Thread.sleep(5000);
		
		String s1=new String("india");
		System.out.println(s1.hashCode());

	}

}

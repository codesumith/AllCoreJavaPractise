package com.sumith.Practice;

public class InsertString {

	public static void main(String[] args) {
		
		String s="Hello, world";
		
		s.replace(", ", " Java ");
		
		System.out.println(s);
		
		char[] ch=s.toCharArray();
		
		s="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') s+=" Java ";
			
			else s+=ch[i];
		
		}
System.out.println(s);
	}

}

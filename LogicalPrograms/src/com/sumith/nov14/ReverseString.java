package com.sumith.nov14;

public class ReverseString {

	public static void main(String[] args) {
		
		 String str ="Java is a languagegh hjj kjhh";
		
		 String ar [] = str.split(" ");
		 
		String str2="";
		 
		 for(String s :ar)
		 {

			 for(int i=s.length()-1;i>=0;i--)
			 {
				 
				 str2+=s.charAt(i);
			 }
			 str2+=" ";
		 }
		 
		 System.out.println(str2);
	}
	
}

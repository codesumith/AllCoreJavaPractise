package com.sumith.reverse_a_string;

public class Reverse_A_String {
	
	public void RevString(String word) {
		String str="";
		for(int i=0;i<word.length();i++) {
			
			char c=word.charAt(i);
			
			 str=c+str;
			
			
		}
		
		System.out.println(str);
	}
	
	

}

package com.sumith.nov15;

public class MovingCharacter {

	public static String rotate(String s,int k)
	{
		String st="";
		
		for(int i=s.length()-k;i<s.length();i++)
		{
			st+=s.charAt(i);
		}
		
		for(int i=0;i<=(s.length()-1)-k;i++)
		{
			st+=s.charAt(i);
		}
		return st;
	}
	public static void main(String[] args) {
		
System.out.println(rotate("talent",2));
	}

}

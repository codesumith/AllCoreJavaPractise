package com.sumith.nov15;

public class Opposite {

	
	public static String encrypt(String st)
	{
		String sr="";
		
		String plain  ="abcdefghijklmnopqrstuvwxyz";
		String cipler= "zyxwvutsrqponmlkjihgfedcba";
		
		for(int i=0;i<st.length();i++)
		{
			for( int j=0;j<plain.length();j++)
			{
				if(st.charAt(i)==plain.charAt(j))
				sr+=cipler.charAt(j);
			}
		}
		return sr;
	}
	
	public static String decrypt(String st)
	{
		String sr="";
		
		String plain  ="abcdefghijklmnopqrstuvwxyz";
		String cipler= "zyxwvutsrqponmlkjihgfedcba";
		
		for(int i=0;i<st.length();i++)
		{
			for( int j=0;j<cipler.length();j++)
			{
				if(st.charAt(i)==cipler.charAt(j))
				sr+=plain.charAt(j);
			}
		}
		return sr;
	}
	
	public static void main(String[] args) {
		System.out.println(encrypt("doctor"));
		System.out.println(decrypt("wlxgli"));
	}
	}


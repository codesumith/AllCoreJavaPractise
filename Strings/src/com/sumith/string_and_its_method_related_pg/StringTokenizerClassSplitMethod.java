package com.sumith.string_and_its_method_related_pg;

import java.util.StringTokenizer;

public class StringTokenizerClassSplitMethod {

	public static void main(String[] args) {
		
String str="Hyderabad is a lovely place";
StringTokenizer st=new StringTokenizer(str,"a");


System.out.println("Number of tokens : "+st.countTokens());
System.out.println("The tokens are : ");

while(st.hasMoreElements())
{
	String token =st.nextToken();
	System.out.println(token);
}
	}

}

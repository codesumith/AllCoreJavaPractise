package com.sumith.test_programs_sep23;
public class StringRotation {

	public static void main(String[] args) {
		
String s1="IndiaVsEngland";

String s2="EnglandIndiaVs";

String s3="";



for(int i=0;i<s1.length();i++)
{
	if(Character.isUpperCase(s1.charAt(i)))
	{
		s3+=s1.charAt(i);
	}
}


int count=0;

for(int i=0;i<s3.length();i++)
{
	for(int j=0;j<s2.length();j++)
	{
		if(s3.charAt(i)==s2.charAt(j))
		{
			count++;
		}
	}
}


if(count==s3.length()) System.out.println(s1+" and "+s2+" are rotation of each other.");


else System.out.println(s1+" and "+s2+" are not rotation of each other.");
	}

}

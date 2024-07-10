package com.sumith.programs_string_method;


import java.util.Scanner;

public class DublicateValuesinString {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string : ");
String str=sc.next();

int count =0;

char [] arr =str.toCharArray();

System.out.println("Dublicate characters are : ");
for(int i=0;i<arr.length-1;i++) {
	
	for(int j=i+1;j<arr.length;j++)
	{
		
		if (arr[i]==arr[j]) {
			System.out.println(arr[j]);
			count++;
			break;
		}
		
		
	}
}
System.out.println("Total dublicate values are :"+count);
sc.close();
	}

}

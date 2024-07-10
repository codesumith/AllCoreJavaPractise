package com.sumith.test_sep16;

import java.util.Scanner;

public class StringDigitAddition {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.next();
		
		int num=0;
		
		
		
		for(int i=0;i<str.length();i++) {
	
			if(str.charAt(i)>47&&str.charAt(i)<58) {
				num+=str.charAt(i)-48;
				System.out.println("Digit is: "+str.charAt(i));
			}
		}
		
		System.out.println("String Digits addition is : "+num);
		
		sc.close();
	}

}

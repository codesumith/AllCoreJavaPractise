package com.sumith.occurence_of_Char;

import java.util.Scanner;

public class Occurence {
	
	
	
	public void occurence() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=sc.nextLine().toLowerCase();
		
		System.out.print("Enter charcater: ");
		char c=sc.next().toLowerCase().charAt(0);
		
		
		char ch;
		int count=0;
			
        for(int i=0;i<str.length();i++) {
        	
        	 ch=str.charAt(i);
        	
	if(ch==c) {
		
		 count++;
	}
	
	

			
        }	
		
        System.out.println("Occurence of "+c+" is "+count+" times");
    	sc.close();
		
		
	}

	}

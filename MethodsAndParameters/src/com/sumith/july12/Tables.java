package com.sumith.july12;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter table number:");
        int num=sc.nextInt();
        
        //int mul;
        for(int i=1;i<=10;i++) {
        	
        	        			System.out.println(num+" X "+i+" = "+num*i);
        	
        }
        sc.close();
	}

}

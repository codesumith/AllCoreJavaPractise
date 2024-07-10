package com.sumith.Iq;

import java.util.Scanner;

public class WithArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int size;
		int index=0;
		char choice;
		
		System.out.println("Enter how many element you want to store");
		 size=sc.nextInt();
		 
		 
		 int [] value=new int[size];
		 
		 
		 do {
			 System.out.println("Enter the element you want to store");
			 value[index++]=sc.nextInt();
			 System.out.println("Enter choice if you want  to store more elements:");
			 System.out.println("For yes press y or Y");
			 System.out.println("For no press nor N");
			 choice=sc.next().charAt(0);
		 }
		 while(choice=='y'|| choice=='Y');
		 
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(value[i]+" ");
		 }
sc.close();
	}

}

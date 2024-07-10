package com.sumith.Iq;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Element_Without_UsingForLoop {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size=sc.nextInt();
		int [] ar=new int[size];
		
		
		for(int i=0; i<ar.length; i++) {
			
			System.out.print("Enter the element of array index "+i+" :");
			ar[i]=sc.nextInt();
			
		}
		
		System.out.print("Array elemnts after inserting : ");
		System.out.print(Arrays.toString(ar));
		sc.close();
		
	}
	
	

}

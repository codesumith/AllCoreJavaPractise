package com.sumith.programs_sep1;

import java.util.Arrays;
import java.util.Scanner;

public class Separate_Odd_and_even_Integers {
	
	public static int[] odd(int[] arr) {
		int k=0;
		int [] od=new int[arr.length];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				od[k]=arr[i];
				k++;
			}
		}
		int [] odd=new int[k];
		for (int i=0;i<odd.length;i++) {
			odd[i]=od[i];
			}
		
		return odd;
	}
	
	public static int[] even(int[] arr) {
		int k=0;
		int [] eve=new int[arr.length];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				eve[k]=arr[i];
				k++;
			}
		}
		int [] even=new int[k];
		for (int i=0;i<even.length;i++) {
			even[i]=eve[i];
			}
		
		return even;
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);

		
		System.out.print("Enter the size of the array : ");int size =sc.nextInt();
		System.out.println("------------------------------------------------------");
		
		
		int[]arr=new int [size];
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("Enter the array element of "+i+" Index : ");arr[i]=sc.nextInt();
			
		}
		System.out.println("------------------------------------------------------");
		
		int [] odd = odd(arr);
		System.out.println("The odd Elements are : "+Arrays.toString(odd));
		
		System.out.println("------------------------------------------------------");
		
		int [] even=even(arr);
		System.out.println("The even Elements are : "+Arrays.toString(even));
		
		
		sc.close();
	}

}

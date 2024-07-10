package com.sumith.aug25Arrays;

import java.util.Scanner;

public class StoreElements {

	public static void main(String[] args) {
		
		int [] arr=new int[10];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
			System.out.print("Enter Element array of "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Elements in array are ");
			for(int num : arr) {
			
			System.out.print(num+" ");
			}
			sc.close();
	}

}

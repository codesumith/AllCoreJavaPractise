package com.sumith.arraysPractise;

import java.util.Scanner;

public class Seaching_nth_Largest_Element {

	public   void nthLargest(int[] arr, int largestNo) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
if(largestNo>arr.length) 
	System.out.println("Out of Lenght");

else
		System.out.println("The nth Largest number in Array is :-" + arr[largestNo-1]);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array :- ");

		int size = sc.nextInt();
		System.out.println();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the Array element of " + i + " Index :- ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		System.out.println("Enter the nth Largest number you want to search :-");

		int largestNo = sc.nextInt();
		
		Seaching_nth_Largest_Element s=new Seaching_nth_Largest_Element();
		s.nthLargest(arr, largestNo);
		
		System.out.println("Array Elemnts are :-");
		
		for(int num: arr) {
			System.out.println(num);
		}

		sc.close();
	}

}

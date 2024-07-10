package com.sumith.arraysPractise;

import java.util.Scanner;

public class Searching_Nth_Smallest_number {

	public static void smallestNthNo(int arr[], int smallest) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		if (smallest > arr.length) {
			System.out.println("The nth number you have entered is out of Array size");

		} else
			System.out.println("The nth Smallest number in Array is :" + arr[smallest - 1]);
			
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the Array : ");
		int size = sc.nextInt();
		System.out.println();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the Array element of " + i + " Index : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();

		System.out.print("Enter the nth samllest number you want to find in Array");
		int smallest = sc.nextInt();

		smallestNthNo(arr, smallest);System.out.println();
		
		System.out.print("Array Elements are : ");
		
		for(int num: arr) {
			System.out.print(num+" ");
		}

		sc.close();
	}

}

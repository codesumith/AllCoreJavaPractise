package com.sumith.arraysPractise;

import java.util.Scanner;

public class SortingArrays_in_Desending_Order_with_Method {

	public static void desendingArray(int[] arr) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("After Sorting in Desending :-");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	
	public static void asendingArray(int[] arr) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("After Sorting in asending :-");

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array  : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			System.out.print("Enter the element of array " + i + " Index :- ");

			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.print("Array Elements Before Sorting :- ");

		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();
		desendingArray(arr);
		System.out.println();
		asendingArray(arr);
		
		
		
		sc.close();
	}

}

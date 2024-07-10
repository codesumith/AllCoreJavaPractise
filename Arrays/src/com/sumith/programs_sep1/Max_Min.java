package com.sumith.programs_sep1;

import java.util.Scanner;

public class Max_Min {

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {

				max = arr[i + 1];
			}
		}
		return max;

	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {

				min = arr[i + 1];
			}
		}
		return min;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int size = sc.nextInt();
		System.out.println("------------------------------------------------------");

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the array element of " + i + " Index : ");
			arr[i] = sc.nextInt();

		}
		System.out.println("------------------------------------------------------");

		System.out.println("Maximum Element is : " + max(arr));
		System.out.println("------------------------------------------------------");

		System.out.println("Minimum Element is : " + min(arr));

		sc.close();
	}

}

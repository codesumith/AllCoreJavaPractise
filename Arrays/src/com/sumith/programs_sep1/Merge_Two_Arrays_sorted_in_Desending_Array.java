package com.sumith.programs_sep1;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Arrays_sorted_in_Desending_Array {
	
	
	public static int[] storingArray(int[] arr) {
		//Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Array Element of " + i + " Index : ");
			//arr[i] = sc.nextInt();
		}
		
		return arr;
		

	}

	public static int[] mergingArray(int[] arr1, int[] arr2) {
		int z = 0;

		int[] merge1 = new int[arr1.length + arr2.length];

		for (int i = 0; i < merge1.length; i++) {
			if (i < arr1.length) {

				merge1[i] = arr1[i];

			} else {
				merge1[i] = arr2[z];
				z++;
			}
		}

		return merge1;

	}

	public static int[] arrayDesending(int[] arr) {

		
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i] = arr[j]; 
					arr[j]= temp;
				}
			}
		}

		return arr;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of first Array :");
		int size1 = sc.nextInt();
		System.out.println("------------------------------------------------------");
		
		int[] arr1 = new int[size1];
		arr1 = storingArray(arr1);
		System.out.println("------------------------------------------------------");

		System.out.print("Enter the size of Second Array :");
		int size2 = sc.nextInt();
		System.out.println("------------------------------------------------------");
		int[] arr2 = new int[size2];
		arr2 = storingArray(arr2);
		System.out.println("------------------------------------------------------");

		int[] merge = new int[arr1.length + arr2.length];
		merge = mergingArray(arr1, arr2);
		System.out.print(" After merging arrays : ");
		System.out.println(Arrays.toString(merge));
		System.out.println("------------------------------------------------------");
		
		merge = arrayDesending(merge);
		System.out.println("Merged array in desending order : " + Arrays.toString(merge));

		sc.close();
	}

}

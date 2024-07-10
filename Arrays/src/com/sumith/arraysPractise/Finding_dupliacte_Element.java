package com.sumith.arraysPractise;

import java.util.Arrays;

public class Finding_dupliacte_Element {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 2, 6, 7, 9, 0, 2, 9 };
		Arrays.sort(arr);

		System.out.print("Array elements after Sorting are :"+Arrays.toString(arr));
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					arr[j] = '*';
					count++;
				}

			}
			if (arr[i] != '*' && count != 0) {
				System.out.println("Duplicate Elements are " + arr[i]);
				count = 0;
			}
		}

	}

}

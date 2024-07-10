package com.sumith.arraysPractise;

import java.util.Scanner;

public class Searching_element {

	public  void searchElement(int[] hi, int search) {
		int count = 0;

		for (int i = 0; i < hi.length; i++) {

			if (hi[i] == search) {
				count++;
				System.out.println("Element found at " + i + " Index :- ");
				break;
			}

		}

		if (count == 0) {
			System.out.println("!!!----Element Not Found----!!!");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the Array  :- ");

		int size = sc.nextInt();

		System.out.println();

		int[] hi = new int[size];

		for (int i = 0; i < hi.length; i++) {
			System.out.print("Enter the Array element of " + i + " Index :- ");
			hi[i] = sc.nextInt();
		}

		System.out.println();

		System.out.print("Enter the element you want to search in Array  :- ");

		int search = sc.nextInt();

		Searching_element s = new Searching_element();
		s.searchElement(hi, search);

		sc.close();
	}

}

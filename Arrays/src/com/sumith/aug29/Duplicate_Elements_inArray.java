package com.sumith.aug29;

import java.util.Scanner;

public class Duplicate_Elements_inArray {
	public static int countDuplicate(int[] arr) {
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
	
		
	}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of the Array : ");int size =sc.nextInt();
				
				int [] array=new int[size];
				
				for(int i=0;i<array.length;i++) {
					System.out.print("Enter the Array element of"+i+" Index : ");
					array[i]=sc.nextInt();
				}
				int duplicate=countDuplicate(array);
				
				System.out.println("Total number of duplicate elements found in the array is : "+duplicate);
				
				sc.close();
	}

}

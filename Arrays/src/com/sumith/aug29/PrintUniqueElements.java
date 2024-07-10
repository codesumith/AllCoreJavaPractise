package com.sumith.aug29;

import java.util.Scanner;

public class PrintUniqueElements {
	
	public static int[] getUniqueElement(int[] array){
		int c=0;
		int h=0;
		int [] uniqueElement=new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			 c=0;
			for(int j=0;j<array.length;j++) {
			if(array[i]==array[j]) {
				c++;
			
			}
			}
			if(c>1) {
				
			}
			else {
				uniqueElement[h]=array[i];
				h++;
			}
		}
		
		return uniqueElement;
		
	}
	
	public static void print(int [] array) {
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
			System.out.println("Array Element of "+i+ " Index is : "+array[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of the Array : ");int size =sc.nextInt();
		
		int [] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter the Array element of"+i+" Index : ");
			array[i]=sc.nextInt();
		}
		
		print(array);
		System.out.println("unique Array is :");
		
		int [] result =getUniqueElement(array);
		
		print(result);
		
		
		sc.close();
	}

}

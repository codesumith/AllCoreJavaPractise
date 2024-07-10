package com.sumith.programs_sep1;

import java.util.Arrays;
import java.util.Scanner;

public class Unique_Elements_in_Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");int size=sc.nextInt();
		int [] arr=new int[size];
		  for(int i=0;i<arr.length;i++) {
			  System.out.print("Enter the Array element of "+i+" index  :");
			  arr[i]=sc.nextInt();
		  }
		
		
		int [] uniq=new int[arr.length];
		int k=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				uniq[k]=arr[i];
				k++;
			}
			
		}

		uniq[k]=arr[arr.length-1];
		
		
		int []uniqueNum=new int[k+1];
		int h=0;
		
		for(int i=0;i<uniq.length;i++) {
			if(uniq[i]!=0) {
				uniqueNum[h]=uniq[i];
				h++;
			}
			
		}
	
System.out.print("Unique Elements are : "+Arrays.toString(uniqueNum));
sc.close();
	}

}

package com.sumith.Test_sep2;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_the_element_of_user_choice {
	
	public static int[] deleteElement(int[] arr,int element) {
		
		int [] del=new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if(i==element) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				break;
			}
			
		}
		
		for(int i=0;i<del.length;i++) {
			del[i]=arr[i];
		}

		
		
		return del;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int [] arr= {1,5,2,3,6};
	
	System.out.println(Arrays.toString(arr));
	
	System.out.println("------------------------------------------------------------");
	
	System.out.print("Enter index number you want to delete : ");int indexChoice =sc.nextInt()-1;
	
	System.out.println("------------------------------------------------------------");
	
	arr=deleteElement(arr,indexChoice);
	
	System.out.println("Array after deletion of element : "+Arrays.toString(arr));
	
	sc.close();
	
}

}

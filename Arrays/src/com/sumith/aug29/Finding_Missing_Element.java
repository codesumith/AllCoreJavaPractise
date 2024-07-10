package com.sumith.aug29;

import java.util.Arrays;
import java.util.Scanner;

public class Finding_Missing_Element {
	
	public static int findMissingElement(int [] arr) {//1,2,3,5,6
		
		for(int i=0;i<arr.length-1;i++) {
			//  0      <5
			//  1
			//  2
			//  3
			//5
			for(int j=arr[i];j<arr[i+1];j++) {
				//     1     1<2
				//     2     2<2 f
				
				//     2     2<3 
				//     3     3<3f
				
				//     3     3<5
				//     4     4<5
				//     5     5<5f
				
				//    5      5<6
				//    6      6<6
				if(arr[i]!=j) {
					// 1   1 f
					//2    2 f
					//3    3f;
					//3    4
					//5    5f
					System.out.println("Missing Element is : " +j);//4
				}
			}
		}
		
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the size of the Array :");
        
        int size=sc.nextInt(); 
        
        int [] array=new int[size];
        
        for(int i=0;i<array.length;i++){
            
             System.out.print("Enter the Array element of "+i+" Index : ");array[i]=sc.nextInt();
            
        }
        
       System.out.println(Arrays.toString(array));
       
       findMissingElement(array);
sc.close();
	}

}

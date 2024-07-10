package com.sumith.Iq;

import java.util.Arrays;


public class PrintingArrayElementsUsingSecondWay {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
				
		}
		
		System.out.println();
		System.out.println("------------------------------------------");
		
		int i=1,i1=3,i2=4;
		int [] arr2= {i,i1,i2};
		
        for( i=0;i<arr2.length;i++) {
			
			System.out.print(arr[i]+" ");
				
		}
        
        System.out.println();
		System.out.println("------------------------------------------");
		
		Student s=new Student("Dhoni",1);
		Student s1=new Student("Virat",2);
		Student s2=new Student("rohit", 3);
		Student [] students= {s,s1,s2};
		for( i=0;i<students.length;i++) { 
		System.out.println(students[i]);
	}
	 
		 System.out.println(Arrays.toString(students));
		
		 
	
	}

}

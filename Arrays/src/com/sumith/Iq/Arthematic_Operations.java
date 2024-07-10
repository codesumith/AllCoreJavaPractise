package com.sumith.Iq;

import java.util.Arrays;
import java.util.Scanner;

public class Arthematic_Operations{
	
	
		
		public static int[] Calculation(int [] art) {
			
		
		int add=art[0];
		int sub=art[0];
		int mul=art[0];
		
		for(int i=1;i<art.length;i++) {
			
			
			add+=art[i];
			sub-=art[i];
			mul*=art[i];
			
		}
		

		
		int [] result= new int[]{add,sub,mul};
		return result;
		}
		
		public static void main(String[]args) {	
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter size of the array :");
			int size=sc.nextInt();
			int [] art=new int[size];
			
			for(int i=0;i<art.length;i++) {
				
				System.out.print("Enter array element of index  "+i+": ");
				art[i]=sc.nextInt();
					
			}
			
			int [] result=Arthematic_Operations.Calculation(art);
			
			System.out.println("Additon of array is : "+result[0]);
			System.out.println("Substarction of array is : "+result[1]);
			System.out.println("Multiplication of array is : "+result[2]);
			
			System.out.println(Arrays.toString(result));
			sc.close();
					
	}
}
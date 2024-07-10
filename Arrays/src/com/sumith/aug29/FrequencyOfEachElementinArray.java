package com.sumith.aug29;

import java.util.Scanner;

public class FrequencyOfEachElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
System.out.print("Enter the size of the Array : ");int size =sc.nextInt();
		
		int [] array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter the Array element of"+i+" Index : ");
			array[i]=sc.nextInt();
		}
System.out.println();

System.out.println("Frequency of Element is : " );
int frequency=1;
for(int i=0;i<array.length;i++) {
	for(int j=1;j<array.length;j++) {
		if(array[i]==array[j]) {
			frequency++;
		}
		
	}
	System.out.println(array[i] +" occurs "+frequency+" times");
	frequency=0;
}

		 
		
		sc.close();
	}

}

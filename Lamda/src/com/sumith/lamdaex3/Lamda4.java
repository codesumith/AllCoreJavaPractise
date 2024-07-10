package com.sumith.lamdaex3;

import java.util.Scanner;

public class Lamda4 {

	public static void main(String[] args) {
		
		Length l= (str) -> 
		{
			return  str.length();
		};
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a name");
		String name=sc.nextLine();
		System.out.println("length of "+name+" is "+l.getLength(name));
		sc.close();
		
		
		

	}

}

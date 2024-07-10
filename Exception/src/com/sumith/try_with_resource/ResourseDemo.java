package com.sumith.try_with_resource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ResourseDemo {

	public static void main(String[] args) {
		System.out.println("Main method started.... ");
		
		Scanner sc =new Scanner(System.in);
		
		try(sc){
			System.out.println("Enter your roll Number : ");
			int roll =sc.nextInt();
			System.out.println("Your roll no is : "+roll);
		}
		catch(InputMismatchException e) {
			System.out.println("Please Provide proper input ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method ended");
	}

}

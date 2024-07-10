package com.sumith.try_catch_blocks;

public class FinallyBlock {
	public static void main(String[] args) {

		try {
			System.out.println("Main method staretd...");
			System.out.println(10 / 0);
		} 
		finally {
			System.out.println("Finally block will be executed...");
		}
		System.out.println("main method completed");
	}
}

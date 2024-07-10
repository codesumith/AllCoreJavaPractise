package com.sumith.exam_mcqaug26;
class Sample {
	static {
		System.out.print("1 ");
	}
	Sample() {
		super();
		System.out.print("3 ");
		{
			System.out.print("2 ");
		}
		
	}
}
public class Ex4 extends Sample{
 	static {
		System.out.print("4 ");
	}
	
	Ex4(){
		super();
		System.out.print("6 ");
		{
			System.out.print("5 ");
		}
		
	}
	public static void main(String[] args) {
		//Ex4 e=new  Ex4();
		
	}
		
}
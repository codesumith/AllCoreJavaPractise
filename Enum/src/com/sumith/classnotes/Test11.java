package com.sumith.classnotes;

enum MyType{
	
	ONE{
		@Override
		public String toString() {
			
			return "This is one";
		}
		
	},
	TWO{
		@Override
		public String toString() {
			return "This is two";
		}
		
	},
	
}

public class Test11 {
	
	public static void main(String[] args) {
		System.out.println(MyType.ONE);
		System.out.println(MyType.TWO);
	}

}

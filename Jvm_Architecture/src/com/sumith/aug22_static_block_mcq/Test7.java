package com.sumith.aug22_static_block_mcq;
class Test7 {
		//static variable a
		static int a = 20;
		int b=30;
		 public static void m1() {
			System.out.println(a);
		}
		 static{
			 System.out.println(a);
			 
		 }
		 
		 {
			 System.out.println(a);
		 }
		 
		 Test7(){
			 System.out.println(a);
		 }
		public static void main(String[] args) {
			//write code here to access a variable with diff ways
			System.out.println(a);
			System.out.println(Test7.a);
		    Test7.m1();
		    
		     Test7 t =new Test7();
		    //System.out.println(t.a);
		    System.out.println(t.b);
		}
	}
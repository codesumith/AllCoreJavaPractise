package com.sumith.aug22_static_block_mcq;
class Test8 {
		static void m1() {
			System.out.println("Test8 : m1() called");
		}
		{
			m1();
		}
		static {
			m1();
		}
		Test8(){
			m1();
		}
		public static void main(String[] args) {
			//write code here
			m1();
			Test8.m1();
			//Test8 t=new Test8();
			//t.m1();
			
			
			
		}
	}
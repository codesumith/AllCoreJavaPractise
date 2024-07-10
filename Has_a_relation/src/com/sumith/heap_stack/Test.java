package com.sumith.heap_stack;

public class Test {
	
	Test t;
	int val;
	
	public Test(int val) {
		
		this.val=val;
	}

	
	public Test( int val,Test t) {
		super();
		this.t = t;
		this.val = val;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test(100);
		
		Test t2=new Test(200,t1);
		
		Test t3=new Test(300,t1);
		
		Test t4=new Test(400,t2);
		
		t2.t=t3;
		
		t3.t=t4;
		
		t1.t=t2.t;
		
		t2.t=t4.t;
		
		System.out.println(t1.t.val);
		
		System.out.println(t2.t.val);
		
		System.out.println(t3.t.val);
		
		System.out.println(t4.t.val);
	}

}

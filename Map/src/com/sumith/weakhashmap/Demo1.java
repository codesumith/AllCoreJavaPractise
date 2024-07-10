package com.sumith.weakhashmap;

import java.util.WeakHashMap;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		WeakHashMap<Test,String> map =new WeakHashMap<>();
		
		Test t= new Test();
		map.put(t, "Rahul"); //here we are passing reference t as a key
		
		System.out.println(map); //{Test Nit = Rahul}
		
		t=null;
		
		System.gc(); //Explicitly calling  garbage collector
		
		Thread.sleep(5000);
		
		System.out.println(map);
		

	}

}

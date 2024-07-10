package com.sumith.concurrenthashmap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Ex1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap =new HashMap<Integer,String>();
		hashMap.put(1, "Ravi");
		hashMap.put(2, "Ankit");
		hashMap.put(3, "Prashant");
		hashMap.put(4, "Pallavi");
		
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<Integer, String>(hashMap);
		System.out.println("Object from ConcurrentHashMap :"+chm);
	}

}

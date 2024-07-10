package com.sumith.concurrenthashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ex2 {
	
	public static void main(String[] args) {
		//Creating concurrent hashmap
		Map<String,String> cityTemperatureMap =new ConcurrentHashMap<String,String>();
		cityTemperatureMap.put("Delhi", "30");
		cityTemperatureMap.put("Mumbai", "32");
		cityTemperatureMap.put("Chennai", "35");
		cityTemperatureMap.put("Bangalore", "22");
		
		Iterator<String> iterator =cityTemperatureMap.keySet().iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(cityTemperatureMap.get(iterator.next()));
			
			//adding new value it wont throw error
			cityTemperatureMap.put("Hyderabad", "28");
		}
		
	}

}

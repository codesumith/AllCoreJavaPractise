package com.sumith.properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Ex2System {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Properties p=System.getProperties();
		
		Set s=p.entrySet();
		
		Iterator itr =s.iterator();
		
		
		while(itr.hasNext())
		{
			Map.Entry entry =(Entry) itr.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}

}

package com.sumith.HashMap;

import java.util.HashMap;

public class HashMapDemp8 {
	
	public static void main(String[] args) {
		Employee e1 =new Employee(101,"Aryan");
		Employee e2 = new Employee(102,"Pooja");
		Employee e3 =new Employee(101,"Aryan");
		Employee e4= e2;
		
		HashMap<Employee,String> hm =new HashMap<>();
		hm.put(e1, "Ameerpet");
		hm.put(e2,"S.R Nagar");
		hm.put(e3, "Begumpet");
		hm.put(e4, "Panjagutta");
		
		hm.forEach((k,v) -> System.out.println(k+" : "+v));
		
	}

}

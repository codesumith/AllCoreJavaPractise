package com.sumith.treemap;

import java.util.TreeMap;

public class Demo3 {
	
public static void main(String[] args) {
	
	System.out.println("Sorting name -> Ascending order");
TreeMap<Employee,String> tm1 = new TreeMap <> (new FirstComparator());

tm1.put(new Employee(101,"Zaheer",24), "Hyderabad");
tm1.put(new Employee(201,"Aryan",27), "Jamshedpur");
tm1.put(new Employee(301,"Pooja",26), "Mumbai");

System.out.println(tm1);

System.out.println("---------------------------------------------------");

System.out.println("Sorting name -> descending order");

TreeMap<Employee,String> tm2 =new TreeMap<> ((e1,e2) -> -e1.name.compareTo(e2.name));

tm2.put(new Employee(101,"Zaheer",24), "Hyderabad");
tm2.put(new Employee(201,"Aryan",27), "Jamshedpur");
tm2.put(new Employee(301,"Pooja",26), "Mumbai");

System.out.println(tm2);
System.out.println("---------------------------------------------------");

System.out.println("Sorting Age -> Ascending order");
TreeMap<Employee,String> tm3 = new TreeMap <> ((e1,e2) -> e1.age.compareTo(e2.age));

tm3.put(new Employee(101,"Zaheer",24), "Hyderabad");
tm3.put(new Employee(201,"Aryan",27), "Jamshedpur");
tm3.put(new Employee(301,"Pooja",26), "Mumbai");

System.out.println(tm3);
System.out.println("---------------------------------------------------");

System.out.println("Sorting Age -> Desending order");
TreeMap<Employee,String> tm4 =new TreeMap<> ((e1,e2) -> -e1.age.compareTo(e2.age));

tm4.put(new Employee(101,"Zaheer",24), "Hyderabad");
tm4.put(new Employee(201,"Aryan",27), "Jamshedpur");
tm4.put(new Employee(301,"Pooja",26), "Mumbai");

System.out.println(tm4);
}

}

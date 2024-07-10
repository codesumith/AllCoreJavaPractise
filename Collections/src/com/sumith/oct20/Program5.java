package com.sumith.oct20;
import java.util.HashMap;

class Employee {
@SuppressWarnings("unused")
private String name;
public Employee (String name) {
this.name = name;
}
@Override
public boolean equals(Object obj){
return true;
}

}
public class Program5 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String...a) {
HashMap hm=new HashMap();
hm.put(new Employee ("a"), "emp1");
hm.put(new Employee("b"), "emp2");
hm.put(new Employee ("a"), "emp1 OVERRIDDEN");
System.out.println(hm.size());
System.out.println(hm.get(new Employee("a")));
}
}
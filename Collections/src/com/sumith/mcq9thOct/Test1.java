package com.sumith.mcq9thOct;



import java.util.Vector;

public class Test1 {
@SuppressWarnings({ "unchecked", "removal", "rawtypes" })
public static void main(String args[]){
Vector obj = new Vector(4,2);
obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
obj.addElement(new Integer(5));
System.out.println(obj.elementAt(2));
}

}




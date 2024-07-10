package com.sumith.mcq9thOct;

import java.util.List;
import java.util.Vector;

public class Test8 {
public static void main(String args[])
{

        Vector<String> vector = new Vector<String>();
        vector.add("C");
        vector.add("C++");
        vector.add("C#");
        vector.add("JAVA");
        vector.add("RUBY");
        System.out.println("Original vector: " + vector);
        List<String> list = vector.subList(2, 4);
        System.out.print("Sub list from vector: " + list);
   }
}
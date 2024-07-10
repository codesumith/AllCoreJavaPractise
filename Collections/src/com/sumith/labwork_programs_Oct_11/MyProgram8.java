package com.sumith.labwork_programs_Oct_11;
import java.util.*;

public class MyProgram8
{
    public static void main(String[] args)
    {
        //Write the logic here
        
        ArrayList<Object> a1= new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
      
        
         ArrayList<Object> a2= new ArrayList<>();
         a2.add("A");
         a2.add("B");
         a2.add("C");
         a2.add("D");
          
        System.out.println("List 1"+a1);
         System.out.println("List 2"+a2);
         
         a1.clear();
         a1.addAll(a2);
           System.out.println("After replacing...");
           
            System.out.println("List 1"+a1);
         System.out.println("List 2"+a2);
    }
}
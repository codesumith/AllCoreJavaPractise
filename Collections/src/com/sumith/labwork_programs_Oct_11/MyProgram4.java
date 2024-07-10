package com.sumith.labwork_programs_Oct_11;
import java.util.*;
public class MyProgram4
{
    public static void main(String[] args)
    {
        // write the logic here 
        ArrayList <String> a1=new ArrayList<>();
        
        a1.add("Red");
        a1.add("Green");
        a1.add("Orange");
        a1.add("White");
        a1.add("Black");
        
        System.out.println(a1);
        
        a1.set(2,"Yellow");
        
        System.out.println("After Replacing element using set method :"+a1);
    }
}
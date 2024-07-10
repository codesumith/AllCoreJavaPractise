package com.sumith.labwork_programs_Oct_11;
import java.util.*;

public class MyProgram5
{
    public static void main(String[] args)
    {
        //Write the logic here
        
        ArrayList<String> a1=new ArrayList<>();
        
        a1.add("Red");
        a1.add("Green");
        a1.add("Orange");
        a1.add("White");
        a1.add("Black");
        
        System.out.println(a1);
        
        a1.remove("Orange");
        
        System.out.println("After removing third element from the list:"+ a1);
    }
}
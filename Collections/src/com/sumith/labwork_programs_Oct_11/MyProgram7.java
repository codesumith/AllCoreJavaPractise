package com.sumith.labwork_programs_Oct_11;
import java.util.*;
public class MyProgram7
{
    public static void main(String[] args)
    {
        //Write the logic here 
        ArrayList<Integer> list =new ArrayList<>();
        list.add(87);
        list.add(678);
        list.add(66);
        list.add(77);
        list.add(33);
        
        System.out.println("List before sorting:"+list);
        
      Collections.sort(list);
        
          System.out.println("After before sorting:"+list);
    }
}
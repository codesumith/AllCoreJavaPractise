package com.sumith.programsOct10;
//import here
import java.util.*;

class No_Z
{
    public List<String> noZ(List<String> strings) {
  //Write your logic here
  List<String> l=new ArrayList<>();
  
  for(String s:strings)
  {
      if(!s.contains("z"))
      {
        l.add(s);
      }
     
     
  }
  return l;
}
    
}
public class No_ZTester
{
    public static void main(String[] args)
    {
        No_Z z=new No_Z();
     //Create object,execute method   
     List<String> l1=Arrays.asList("aaa","bbb","aza");
     System.out.println(l1+"->"+z.noZ(l1));
     
      List<String> l2=Arrays.asList("hziz", "hzello", "hi");
       System.out.println(l2+"->"+z.noZ(l2));
      
       List<String> l3=Arrays.asList("hello", "howz", "are", "youz");
        System.out.println(l3+"->"+z.noZ(l3));
    }
}
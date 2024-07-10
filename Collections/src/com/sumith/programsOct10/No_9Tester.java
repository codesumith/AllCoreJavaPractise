package com.sumith.programsOct10;

import java.util.*;


//import here
class No_9
{
public List<Integer> no9(List<Integer> nums) {
  //Write your logic here
	List<Integer> l4=new ArrayList<>();
	for(int l:nums)
	{
		if(l%10!=9)
		{
			l4.add(l);
		}
	}
  return l4;
}
}

public class No_9Tester
{
    public static void main(String[] args)
    {
    	No_9 n=new No_9(); 
       //Create object,execute method 
    	List<Integer> l1 =Arrays.asList(1,2,19);
    	System.out.println(l1+"->"+n.no9(l1));
//    	l1=n.no9(l1);
//    	System.out.println(l1);
    	
    	List<Integer> l2 =Arrays.asList(9,19,29,3);
    	System.out.println(l2+"->"+n.no9(l2));
//    	l2=n.no9(l2);
//    	System.out.println(l2);
    	
    	List<Integer> l3 =Arrays.asList(1,2,3);
    	System.out.println(l3+"->"+n.no9(l3));
//    	l3=n.no9(l3);
//    	System.out.println(l3);
    	
    	
    }
}
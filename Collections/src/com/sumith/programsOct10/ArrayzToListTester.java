package com.sumith.programsOct10;
import java.util.*;
class ArrayToList {

	public static List<String> convertToList(String[] inputArray) {
	//Write Logic Here
		
		
		List <String>l = new ArrayList<>();
		for(String s:inputArray)
		{
			if(s!=null)
			{
			l.add(s);
			}
		}
		
		
	
	return l;	
	}
	
}


public class ArrayzToListTester
{
    public static void main(String[] args)
    {
        //Create Object Execute Methods
        
       String [] str1={"Welcome","To","Ooty"};
       
       System.out.println(ArrayToList .convertToList(str1));
       
       String [] str2=new String[5];
       
       System.out.println(ArrayToList .convertToList(str2));
    }
}
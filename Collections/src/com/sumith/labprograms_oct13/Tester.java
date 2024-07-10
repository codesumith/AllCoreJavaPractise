package com.sumith.labprograms_oct13;

import java.util.ArrayList;
import java.util.List;

//import file Here
 class RemoveStringsFromList
{
	public List <String> createSubList(String str)
	{			
		List<String> l=new ArrayList<String>();
		String st []=str.split(" ");
		
	//Write Logic Here
		for(String s:st)
		{
			char c=s.toLowerCase().charAt(0);
			char c1=s.toLowerCase().charAt(s.length()-1);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&
					c1!='a'&&c1!='e'&&c1!='i'&&c1!='o'&&c1!='u')
			{
				l.add(s);
			}
		}
	return l;
	}
}
public class Tester
{
    public static void main(String[] args)
    {
        //Create Object And Execute Method
    	String str="apple orange banana grapes MANGO";
    	RemoveStringsFromList r =new RemoveStringsFromList();
    	List<String> l=r.createSubList(str);
    	System.out.println(l);
    }
}
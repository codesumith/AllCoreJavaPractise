package com.sumith.ArrayListPg;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListOps {

public ArrayList<Integer> makeArrayListInt(int n)
{
	
	ArrayList<Integer> l=new ArrayList<>();
	for(int i=1;i<=n;i++)
	{
		l.add(0);
	}
	return l;
}

public ArrayList<Integer> reverseArrayListInt(ArrayList <Integer> list)
{
	ArrayList<Integer> l= new ArrayList<>();
	
	
	
	for(int i=list.size()-1;i>=0;i--)
	{
		
		l.add(list.get(i));
	}
	return l;
}


public ArrayList<Integer> changeList(ArrayList<Integer> list,int m,int n)
{
	ArrayList<Integer> l= new ArrayList<>();
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)==m)
		{
			l.add(n);
		}
		else {
			l.add(list.get(i));
		}
	}
	return l;
	
}

public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
	
	ArrayListOps ao =new ArrayListOps();
	
	System.out.println(ao.makeArrayListInt(4));
	
	System.out.println("Orginal List :"+list);
	
	list=ao.reverseArrayListInt(list);
	System.out.println("Reverse List :"+list);
	
	list=ao.changeList(list, 28, 20);
	System.out.println("After Change :"+list);
}
}

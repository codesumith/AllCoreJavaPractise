package com.sumith.cocurrentcollection;

import java.util.*;

class ConcurrentModification extends Thread
{
	ArrayList<String> al =null;

	public ConcurrentModification(ArrayList<String> al)  //al = arl
	{
		super();
		this.al = al;
	}
	
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		al.add("KIWI");
	}
	
	
}

public class Collection5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> arl =new ArrayList<>();
		arl.add("Apple");
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		
		ConcurrentModification cm =new ConcurrentModification(arl);
		cm.start();
		
		Iterator<String>itr = arl .iterator();
		
		while (itr.hasNext())
		{
			String str =itr.next();
			System.out.println(str);
			Thread.sleep(1500);
		}
		
	}

}

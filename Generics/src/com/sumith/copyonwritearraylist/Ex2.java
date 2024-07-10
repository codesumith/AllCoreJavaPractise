package com.sumith.copyonwritearraylist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentModification extends Thread
{
	CopyOnWriteArrayList<String>al =null;

	public ConcurrentModification(CopyOnWriteArrayList<String> al) {
		super();
		this.al = al;
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {}
		al.add("KIWI");
	}
}

public class Ex2 {
	
	public static void main(String[] args) throws InterruptedException{
		
		CopyOnWriteArrayList<String> arl =new CopyOnWriteArrayList<String>();
		arl.add("Apple");
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		
		ConcurrentModification cm=new ConcurrentModification(arl);
		cm.start();
		
		Iterator<String> itr =arl.iterator();
		while (itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
			Thread.sleep(1500);
		}
		
		System.out.println(". . . . . . . . . ");
		
		Spliterator<String>spl =arl.spliterator();
		spl.forEachRemaining(x -> System.out.println(x));
	}

}

package com.sumith.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertionDeletionDisplayingExit {

	public static void main(String[] args) {
		
LinkedList<Integer> ll=new LinkedList<>();

Scanner s=new Scanner(System.in);

while(true)
{
	System.out.println("Linked List :"+ll);
	System.out.println("\t1.Insert Element."
			           +"\n\t2.Delete Element."
			           +"\n\t3.Display Elements."
			           +"\n\t4.Exit");
	System.out.println("Enter your choice :");
	switch(s.nextInt())
	{
	case 1:
		System.out.println("Enter Element to Insert:");
		int elementToAdd=s.nextInt();
		ll.add(elementToAdd);
		break;
		
	case 2:
		if(ll.isEmpty())
		{
			System.out.println("Linked list is empty nothing to delete..");
		}
		else
		{
			System.out.println("Enter element to delete:");
			int elementToDelete=s.nextInt();
			boolean remove=ll.remove(Integer.valueOf(elementToDelete));
			
			if(remove)
			{
				System.out.println("Element "+elementToDelete+" deleted from the LinkedList.");
			}
			
			else
			{
				System.out.println("Element not found in LinkedList..");
			}
		}
		break;
		
	case 3:
		System.out.println("Elements int linked list:");
		System.out.println(ll);
		break;
		
	case 4:
		System.out.println("ExitingProgram..");
		s.close();
		System.exit(0);
		break;
		
		default :
			System.out.println("Inavlid choice.. Please try again..");
		
	}
}//loop ended

	}

}

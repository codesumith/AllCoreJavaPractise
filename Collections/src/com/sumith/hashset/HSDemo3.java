package com.sumith.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class HSDemo3 {

	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("OPtions:"+"\n\t1. Add element"
										+"\n\t2. Delete element"
										+"\n\t3. Display element"
										+"\n\t4. Exit");
			
			System.out.println("Enter your choice(1/2/3/4) :");
			
			
			switch(Integer.parseInt(s.nextLine()))
			{
			case 1:
				System.out.println("Enter element to add :");
				String ele=s.nextLine();
				if(hs.add(ele))
				{
					System.out.println("Element added succesfully.");
				}
				else
				{
					System.out.println("Element already exist in the HashSet.");
				}
				break;
			case 2:
				System.out.println("Enter element to delete :");
				String eldel=s.nextLine();
				if(hs.remove(eldel))
				{
					System.out.println("Element deleted succesfully.");
					
				}
				else
				{
					System.out.println("Element not found in HashSet.");
				}
				break;
			case 3:
				hs.forEach(str -> System.out.println(str));
				break;
			case 4:
				System.out.println("Exiting the Program");
				s.close();
				System.exit(0);
				break;
				default :
					System.out.println("Invalid choice.. "+"\n   Try again..");
			}
		}
	}
}

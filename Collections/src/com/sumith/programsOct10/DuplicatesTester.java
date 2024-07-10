package com.sumith.programsOct10;
//Import File Here

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Duplicates {
	// TODO define a List attribute called numberList
	List<Integer> numberList;

	// define getters and setters
	
	public List<Integer> getNumberList() {
		return numberList;
	}



	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}





	/**
	 * Default constructor - DO NOT DELETE
	 */
	public Duplicates() {
        //Initialize Instances Variable
	}


	
	


	public Duplicates(List<Integer> numberList) {
		 //Initialize Instances Variable
		this.numberList = numberList;
	}


	public List<Integer> getDuplicatesList() {

				//Write Logic Here
		if(numberList==null)
		{
			return null;
		}
		
		else
		{
			
			ArrayList<Integer> l1=new ArrayList<Integer>(numberList.size());

		int z=1;
		for(int n:numberList)
		{
			int t=0;
			for(int i=z;i<numberList.size();i++)
			{
				if(n==numberList.get(i)&&numberList.get(i)!=0000)
				{
					if(t==0) {
					l1.add(numberList.get(i));
					}
					numberList.set(i, 0000);
					t++;
				}
				
			}
			z++;
		}
		return l1;
		
		}
		
	}

}

public class DuplicatesTester
{
    public static void main(String[] args)
    {
        //Create Object And Execute Method
    	List<Integer> l= Arrays.asList(33,45,67,89,33,47,21,45);
    	List<Integer> l1=Arrays.asList(66,66,77,66,66);
    	
    	Duplicates d=new Duplicates(l);
    	
    	System.out.println(d.getDuplicatesList());
    	//System.out.println(d.getNumberList());
    	
    	Duplicates d1=new Duplicates(l1);
    	
    	System.out.println(d1.getDuplicatesList());
    	System.out.println(d1.getNumberList());
    	
        Duplicates d2=new Duplicates();
    	
    	System.out.println(d2.getDuplicatesList());
    }
}
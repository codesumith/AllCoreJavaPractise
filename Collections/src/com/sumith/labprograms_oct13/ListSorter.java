package com.sumith.labprograms_oct13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Import File Here

class ListSorter1 {

	public static List<Integer> sortIntList(List<Integer> inputList)
	
	{
		
            //Write Logic Here	
		List<Integer> ls=new ArrayList<>(inputList);
		
		ls.sort(null);
		
		return ls;
	}

}
public class ListSorter
{
    public static void main(String[] args)
    {
        //Create Object And Execute Method
        List<Integer> ls= Arrays.asList(4,66,89,34);
        System.out.println(ListSorter1.sortIntList(ls));
    }
}
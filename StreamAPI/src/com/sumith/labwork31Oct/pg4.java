package com.sumith.labwork31Oct;

import java.util.*;
import java.util.function.Predicate;


public class pg4 {
	
	public static void main(String[] args) {
		
		List<String> L=Arrays.asList("Orange","Enpsychlopidea","pineApple","goa","MuskMellon");
		
		Predicate<List<String>> p= x -> x.isEmpty();
		
	    if(!p.test(L))
	    {
	      L.forEach(x ->
	      {
	    	  if(x.length()>6)
	    	  {
	    		  System.out.println(x);
	    	  }
	      });
	    	  
	      
	    }
		
	}

}

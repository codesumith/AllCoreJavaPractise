package com.sumith.intermidiate_terminaloperations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		
	
	List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	
	//without stream
	List<Integer> listEven =new ArrayList<>();
	for(Integer i:list)
	{
		if(i % 2 ==0)
		{
			listEven.add(i);
		}
	}
System.out.println(listEven);
System.out.println("============================");

//with stream which prints only even
List <Integer> even = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
System.out.println(even);
//with stream which prints only odd
System.out.println("=============================");
Set <Integer> odd =list.stream().filter(i -> i%2!=0).collect(Collectors.toSet());
System.out.println(odd);
	}
}

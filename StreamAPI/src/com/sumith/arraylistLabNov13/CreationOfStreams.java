package com.sumith.arraylistLabNov13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreationOfStreams {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//ex
		List<String> l =new ArrayList<String>();
		l.add("HTML");
		l.add("CSS");
		l.add("JAVA SCRIPT");
		Stream<String> s =l.stream();
		s.forEach(sp-> System.out.println(sp));
		
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9,0);
		s1.forEach(sl -> System.out.print(sl));
		
		System.out.println();
		Stream<Integer> s2 =Stream.of(new Integer[] {3,4,5,6,7,8});
		s2.forEach(sl -> System.out.print(sl));
		
		System.out.println();
		
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9);
		//without stream
		List<Integer> listeven =new ArrayList<Integer>();
		for(Integer i : l1)
		{
			if(i%2==0)
			{
				listeven.add(i);
			}
		}
		
		System.out.println(listeven);
		
		//with stream
		
		List <Integer> even =l1.stream().filter(p -> p%2==0).collect(Collectors.toList());
		System.out.println(even);
		
	 //odd
		List <Integer> odd = l1.stream().filter(p -> p%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		
		
		List<String> l2=Arrays.asList("sunil","santa","sumith","slate","slogan");
		
		List<String> startsWithSu =l2.stream().filter(p-> p.startsWith("su")).collect(Collectors.toList());
		System.out.println(startsWithSu);
		
		//prime
		List<Integer> l3 =Arrays.asList(1,2,3,4,5,6,7,55,88);
		
		Predicate<Integer> p1 =new Predicate<Integer>()
				{

					@Override
					public boolean test(Integer t) {
						boolean b =true;
						int count=0;
						for(int i =1;i<=t;i++) {
							if(t%i==0) {
								count++;
								
							}
						}
						if(count>2||t==1||t==0) {
							b=false;
						}
						return b;
					}
			
				};
				
				Iterator<Integer> itr =l3.listIterator();
				while(itr.hasNext()) {
					System.out.print(" "+ p1.test(itr.next()));
				}
		
		System.out.println();
				List<Integer> l4 =Arrays.asList(1,2,3,4,5,6,7,8,9);
				List<Integer> cube=l4.stream().filter(p -> p%2==0).map(n->n*n*n).collect(Collectors.toList());
				cube.forEach(System.out::print);
				
				
				List<Character> l5=Arrays.asList('a','b','c');
				List<Character> l6=Arrays.asList('d','e','f');
				List<Character> l7=Arrays.asList('g','h','i');
				
				List<List<Character>> listOfChar =Arrays.asList(l5,l6,l7);
				List<Character> mergingLists=listOfChar.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
				System.out.println();
				System.out.println(mergingLists);
				
				String sk[]= {"3","30","34","5","9"};
				
				Arrays.sort(sk, (num1,num2)->  (num2+num1).compareTo(num1+num2));
				
				System.out.println(Arrays.deepToString(sk));
		
				String n1="3";
				String n2="30";
				String n3="34";
				String n4="5";
				String n5="9";
				
				//3,5,9,30,34
				
				System.out.println((n3+n2).compareTo(n2+n3));
				
	}

}

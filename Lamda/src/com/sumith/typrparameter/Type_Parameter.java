package com.sumith.typrparameter;

public class Type_Parameter {
	
	public static void main(String[] args) {
		
		Accept<Integer> accInt =new Accept<Integer>(90);
		System.out.println(accInt.getObj());
		
		Accept<Double> accdou= new Accept<Double>(77.81);
		System.out.println(accdou.getObj());
		
		Accept<Character> accChar= new Accept<Character>('A');
		System.out.println(accChar.getObj());
		
		Accept<String> accStr=new Accept<String>("India");
		System.out.println(accStr.getObj());
		
		Accept<Boolean> accBool=new Accept<Boolean>(true);
		System.out.println(accBool.getObj());
		
		Accept<Student> accStd=new Accept<Student>(new Student(111,"Sachin"));
		System.out.println(accStd.getObj());
		}

}

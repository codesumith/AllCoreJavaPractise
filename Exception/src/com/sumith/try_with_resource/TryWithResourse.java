package com.sumith.try_with_resource;


public class TryWithResourse {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Main method Started");
		
		DatabaseResource dr =new DatabaseResource();
;
		FileResource fr=new FileResource();
		
		try(dr;fr){
			System.out.println(10/0);
		}
		
		System.out.println("Main method ended");
	}

}

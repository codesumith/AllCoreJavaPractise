package com.sumith.aug22_static_block_mcq;



public class JVMArc 
{
	public static void main(String[] args) 
	{
		System.out.println(JVMArc.class.getClassLoader());
		System.out.println(JVMArc.class.getClassLoader().getParent());
		System.out.println(JVMArc.class.getClassLoader().getParent().getParent());
		
	
	}

}
package com.sumith.heap_stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int val=100;  //stores in stack
Customer c=new Customer("Anil", 123); //c stores in stack 1000x memory

//name2000x in another address  it will store;

m1(c);

//gc

System.out.println(c.getId());
		}

	public static void m1(Customer cust) {  //stack memory
		
		cust.setId(9);// 9 1000x stack
		
		cust =new Customer("Rahul",7);//m1 stack //1000x stack 
		
		//name2000x in another address  it will store;
		
cust.setId(10);//3000x

System.out.println(cust.getId());
		
	}
	
	
	
	
	
}

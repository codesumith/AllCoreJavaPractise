package com.sumith.problem_with_multithreading;

class Customer implements Runnable

{
	
	int availableSeat =1;
	int wantedSeat;
	
	

	public Customer( int wantedSeat) {
		super();
		this.wantedSeat = wantedSeat;
	}
	

	@Override
	public void run() {
String name =Thread.currentThread().getName();
System.out.println("Available seats is :"+availableSeat);

if(availableSeat >=wantedSeat)
{
	System.out.println(wantedSeat+" Seat reserved for :"+ name);
	availableSeat-=wantedSeat;
}
else
{
	System.out.println("Sorry!!"+name+" seat is not available.");
}
		
	}
	
	
}

public class RailwayReservation {

	public static void main(String[] args) {
		
		var c =new Customer(1);
		
		Thread t1= new Thread(c,"Virat");
		Thread t2= new Thread(c,"Rohith");
		
		t1.start(); t2.start();


	}

}

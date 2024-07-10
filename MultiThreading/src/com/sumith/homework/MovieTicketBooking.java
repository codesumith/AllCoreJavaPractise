package com.sumith.homework;

public class MovieTicketBooking {
	
	int availableTickets=10;
	int noOfTicketsNeeded;
	
	

	public MovieTicketBooking( int noOfTicketsNeeded) {
		super();
		this.noOfTicketsNeeded = noOfTicketsNeeded;
	}



	public static void main(String[] args) {
		
		var mv=new MovieTicketBooking(6);
		
Runnable r=()->
{
	
	System.out.println(Thread.currentThread().getName());
	
	if(mv.noOfTicketsNeeded<=mv.availableTickets) 
		{
		mv.availableTickets-=mv.noOfTicketsNeeded;
		System.out.println("Tickets Booked.");
		}
	
	
	else      System.out.println("Tickets not Available.");
	
		
};

Thread t1 = new Thread(r,"Mission Impossible");
Thread t2 = new Thread(r,"Mission Impossible1");

t1.start();
t2.start();

	}

}

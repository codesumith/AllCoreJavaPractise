package com.sumith.homework;

public class RailwayReservation {
	
	int availableSeat;
	int wantedSeat;
	
	
	
	public RailwayReservation(int availableSeat, int wantedSeat) {
		super();
		this.availableSeat = availableSeat;
		this.wantedSeat = wantedSeat;
	}



	public static void main(String[] args) {
		
		RailwayReservation re = new RailwayReservation(1, 1);
		
		Runnable r= ()->
		{
			
			String name=Thread.currentThread().getName();
			System.out.println("Available Seat is :"+re.availableSeat);
		       
		       if(re.availableSeat >= re.wantedSeat)
		       {
		    	  System.out.println(re.wantedSeat +" Seat reserved for : "+name);
		    	  re.availableSeat = re.availableSeat - re.wantedSeat;    	   
		       }
		       else
		       {
		         System.out.println("Sorry!!"+name+" seat is not available");   	   
		       }
			
		};
		
		Thread t1 = new Thread(r,"Sumith");
		Thread t2 = new Thread(r,"Abc");
		
		t1.start();  t2.start();
	}

}

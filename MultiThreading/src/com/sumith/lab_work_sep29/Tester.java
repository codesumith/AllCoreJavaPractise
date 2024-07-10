package com.sumith.lab_work_sep29;
class TicketDispenser extends Thread{
    int maximumSeats =100;
     int allotedSeats=1;
	
	int allotSeatNumber() throws InterruptedException{
	    //Write the logic to book the ticket based on Requirement
	        for(int i=1;i<=maximumSeats;i++)
	        {
	        	if(allotedSeats<=maximumSeats) {
	            System.out.println("You have alloted with seat no:"+allotedSeats++ +" by "+ Thread.currentThread().getName());
	        	}
	        	else {
	        		return -1;
	        	}
	            
	        }
	        return allotedSeats-1;
	   
	    
	
    }
}


class Tester {

	public static void main(String[] args) throws InterruptedException {
		
	var	t =new TicketDispenser();
	
	Thread t1=new Thread()
			{
		public void run()
		{
			try {
				System.out.println( t.allotSeatNumber());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
			};
			
			t1.start();
			
	  
			Thread t2=new Thread()
			{
		public void run()
		{
			try {
				System.out.println( t.allotSeatNumber());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			};
			
			t2.start();
	  
	}
}



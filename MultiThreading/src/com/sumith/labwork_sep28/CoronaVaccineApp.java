package com.sumith.labwork_sep28;

@SuppressWarnings("serial")
class Exceptn extends Exception
{
    public Exceptn(String msg)
    {
        super(msg);
    }
}

class VaccineEligibility {
   
   private int age =18;
   private boolean hasHealthCondition;
   
   public VaccineEligibility(int age,boolean hasHealthCondition)
   {
       this.setAge(age);
       this.setHasHealthCondition(hasHealthCondition);
       
   }

public void isEligible()
{
    if(getAge()>=18&&getAge()<=60&&isHasHealthCondition()==true)
    {
        System.out.println(" You Are Eligible for Vaccination");
    }
    else System.err.println(" You Are not Eligible for Vaccination");
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isHasHealthCondition() {
	return hasHealthCondition;
}

public void setHasHealthCondition(boolean hasHealthCondition) {
	this.hasHealthCondition = hasHealthCondition;
}

}

class DoseBooking {
	
	private boolean booked;
	
	public void bookDose() throws Exceptn
	{
	    if(booked==true)
	    {
	        throw new Exceptn("Dose already booked");
	    }
	    else
	    {
	        booked=true;
	    }
	    
	}
	
	public void isDoseBooked()
	{
	     if(booked==true)  System.out.println(" You have successfully booked the dose");
	     
	     else System.out.println(" You have not booked the dose");
	}

}

class User {
    
    
    private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name,int age, boolean healthCondition)
	{
	    this.name=name;
	    eligibility=new VaccineEligibility(age, healthCondition);
	    doseBooking=new DoseBooking(); 
	}
	
	public void isEligible()
	{
	    eligibility.isEligible();
	}
	
	public void bookDose() throws Exceptn {
	    if( eligibility.getAge()>=18&&eligibility.getAge()<=60)
	    {
	      doseBooking.bookDose();  
	      System.out.println("Dose booked suucessfully for ramesh");
	    }
	   
	    else    throw new Exceptn(name+ " is not eligible for the vaccine.");
	}
	
	public void isDoseBooked()
	{
	    doseBooking.isDoseBooked();
	   // doseBooking
	}
}


public class CoronaVaccineApp {
	public static void main(String[] args) throws InterruptedException {
		
		/*Write your logic to satisfy all the possible outputs and handle the raised 
		   Runtime Exception */
		
		User u1=new User("Ramesh",25,true);
			User u2=new User("Suresh",17,true);
			
			Thread t1= new Thread()
			{
				@Override
				public void run() {
			    u1.isEligible();
			   
			    try {
					u1.bookDose();
				} catch (Exceptn e) {
					
					System.out.println(e.getMessage());
				}
			    u1.isDoseBooked();
				}
			};
			
			t1.start();
			t1.join();
			
			System.out.println("-------------------------------------------------------------");
			
			Thread t2= new Thread()
			{
				@Override
				public void run() {
			    u2.isEligible();
			    try {
					u2.bookDose();
				} catch (Exceptn e) {
					
					System.out.println(e.getMessage());
				}
			    u2.isDoseBooked();
				}
			};
			
			t2.start();
			
		
	}
}
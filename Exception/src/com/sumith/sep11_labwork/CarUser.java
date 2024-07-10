package com.sumith.sep11_labwork;
@SuppressWarnings("serial")
class CarStopped extends Exception{
      
      
      public CarStopped(String message)
      {
          super(message);
      }
}

@SuppressWarnings("serial")
class CarPuncture extends Exception
{
    public CarPuncture (String message)
    {
        super(message);
    }
    
    public static void puncture(String s) throws CarPuncture
    {
        if(s.equals("puncture"))
        {
            throw new CarPuncture("Car is Punctured ");
        }
        else
        System.out.println("Car not stall");
    }
}

@SuppressWarnings("serial")
class CarHeat extends Exception 
{
    public CarHeat (String message)
    {
        super(message);
    }
    
    public static void carHeat(int a) throws CarHeat
    {
        if(a>50)
        {
            throw new CarHeat("Car is heated more than 50 degrees ");
        }
        else
        System.out.println("Car not stall");
    }
}
 

class CarTest 
{
     
     public static void stop(String s) throws CarStopped
     {
         if(s.equals("stop"))
         {
             throw new CarStopped("Car is stopped");
         }
         else {
        	 System.out.println("Car not stall");
         }
        	 
     }
 }






public class CarUser
{
    public static void main(String[] args)
    {
      /* 
         write  the logic there by following the question
         requirements and call it from the main method 
      */
      try {
    	  CarPuncture.puncture("puncture");
      }
      catch(CarPuncture e)
      {
    	  System.out.println(e.getMessage());
      }
      
      try {
    	  CarTest.stop("stop");
      }
      catch(CarStopped e)
      {
    	  System.out.println(e.getMessage());
      }
      try{
          CarHeat.carHeat(51);
      }
      catch(CarHeat e)
      {
          System.out.println(e.getMessage());
      }
    }
}
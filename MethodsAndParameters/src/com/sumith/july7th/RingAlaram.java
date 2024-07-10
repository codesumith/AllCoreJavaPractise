package com.sumith.july7th;

public class RingAlaram {

	public static String ringAlarm(int dayofweek,boolean onvacation)
	{
		if(dayofweek<0||dayofweek>6)
		{
			System.out.println("Inavalid Inputs");
		}
		else  if(dayofweek>=01&&dayofweek<=5)
		{
			if(onvacation==true)
			{
			System.out.println("10:00");
			}
		}
		else  if(dayofweek>=01&&dayofweek<=5)
		{
			if(onvacation==false)
			{
			System.out.println("07:00");
			}
			else  if(dayofweek==0||dayofweek==6)
			{
				if(onvacation==true)
				{
				System.out.println("off");
				}
			}
			else  if(dayofweek==0||dayofweek==6)
			{
				if(onvacation==false)
				{
				System.out.println("10:00");
				}
			}
			else
				return "Inavlid Inputs";
			
			
			
			}
		return null;
		}
	}

		
		
		
		
		
				
	
		






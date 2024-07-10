package com.sumith.labprograms_oct13;

import java.util.ArrayList;


public class CabCustomerService
{

//Define Instance Variable
	private ArrayList<CabCustomer> cb=new ArrayList<>();

	public void addCustomer(CabCustomer customer)
	{
		//Write Logic Here	
		cb.add(customer);
	}

	public boolean isFirstCustomer(CabCustomer customer)
	{
	//Write Logic Here	
		
		boolean check =true;//cb.contains(customer.getPhone());
		
	for(CabCustomer obj :cb)
	{
		if(obj.getPhone()==customer.getPhone()) //).equals(customer.getPhone())
		{
			check=false;
		}
	}
		
		
		return check;
	}

	public double calculateBill(CabCustomer customer)
	{

		//Write Logic Here	
		
		double calBill=0;
		if(isFirstCustomer(customer))
		{
			 calBill=0;
		}
		else
		{
			int dis =customer.getDistance();
			
			if(dis<=4)
			{
				calBill=80;
				
			}
			else if (dis>4)
			{
				calBill=80+((dis-4)*6);
			}
		}
		
		return calBill;
	}
	public String printBill(CabCustomer customer)
	{
	//Write Logic Here	
		return customer.getCustomerName()+" Please pay your bill of Rs."+calculateBill(customer);
	}
}

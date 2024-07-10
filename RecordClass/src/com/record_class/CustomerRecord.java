package com.record_class;

public record CustomerRecord(int customerId,String customerName,double customerBill) 
{

	//compact constructor
	public CustomerRecord
	{
		if(customerId<0)
		{
			throw new IllegalArgumentException("Check customer id");
		}
	}
	
}

package com.sumith.labprograms_oct13;
public class CabCustomerTester
{
    public static void main(String[] args)
    {
        //Create Object And Execute Method
    	CabCustomer c1=new CabCustomer(112, "John", "Ameerpet", "BanjaraHills", 6, "767676");
    	CabCustomer c2=new CabCustomer(113, "Smith", "Bulkumpet", "JublieHills", 6, "767676");
    	
    	CabCustomerService ccs1=new CabCustomerService();
    	
    	System.out.println(ccs1.printBill(c1));
    	ccs1.addCustomer(c1);
    	
    	System.out.println(ccs1.printBill(c2));
    	ccs1.addCustomer(c2);
    	
    	
    	
    	
    	
    }
}
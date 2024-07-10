package june_26;

public class WholeSellersDiscountOnBillAmount 
{

	public static void main(String[] args) 
	{
		
		int NetBill=4000;
		if(NetBill<5000) 
		{
			
			double Discount      =5;
			double DiscountAmount=(Discount/100)*NetBill;
			double AmountPayable =NetBill-DiscountAmount;
			System.out.println("Discount      :"+Discount+"%");
			System.out.println("DiscountAmount:"+DiscountAmount);
			System.out.println("AmountPayable :"+AmountPayable);
		}
		else if(NetBill>=5000&&NetBill<=10000) 
		{
			double Discount      =10;
			double DiscountAmount=(Discount/100)*NetBill;
			double AmountPayable =NetBill-DiscountAmount;
			System.out.println("Discount      :"+Discount+"%");
			System.out.println("DiscountAmount:"+DiscountAmount);
			System.out.println("AmountPayable :"+AmountPayable);	

	    }
		else if(NetBill>10000) 
		{
		    double Discount      =15;
			double DiscountAmount=(Discount/100)*NetBill;
			double AmountPayable =NetBill-DiscountAmount;
			System.out.println("Discount      :"+Discount+"%");
			System.out.println("DiscountAmount:"+DiscountAmount);
			System.out.println("AmountPayable :"+AmountPayable);	

	    }

	}
}


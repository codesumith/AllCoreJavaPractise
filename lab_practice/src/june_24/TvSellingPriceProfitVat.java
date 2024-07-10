package june_24;

public class TvSellingPriceProfitVat {

	public static void main(String[] args) {
		int TV=32500;
		double Profit = 0.27*TV;
		double Vat=(12.7/100)*TV;
		double ServiceCharge=(3.87/100)*TV;
		double SellingPrice=TV+Profit+Vat+ServiceCharge;
		System.out.println("SELLING PRICE :"+SellingPrice);
		System.out.println("PROFIT        :"+Profit);
        System.out.println("VAT           :"+Vat);
        System.out.println("SERVICE CHARGE:"+ServiceCharge);

	}

}

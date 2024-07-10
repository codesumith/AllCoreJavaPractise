package sellingprice;

public class CalculatingSellingPriceOfaCycle {

	public static void main(String[] args) {
		int purchasedOldCycle=1200;
		int repairs          =250;
		int coloring         =350;
		int accesories       =500;
		int profit           =1500;
		int sellingPrice     =purchasedOldCycle+repairs+coloring+accesories+profit;
		System.out.println("Selling Price:"+sellingPrice);
	}

}

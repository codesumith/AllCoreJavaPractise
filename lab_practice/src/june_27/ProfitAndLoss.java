package june_27;

public class ProfitAndLoss {

	public static void main(String[] args) {
		float Sellingprice    =2500;
		float Costprice       =3000;
		if(Sellingprice>Costprice) 
		{
		float  Profit          =Sellingprice-Costprice;
		float  Loss            =0;
		float  ProfitPercentage=(Profit/Costprice)*100;
		float  LossPercentage  =Loss;
		System.out.println("Profit           :RS"+Profit);
		System.out.println("Loss             :RS"+Loss);
		System.out.println("ProfitPercentage :"+ProfitPercentage+"%");
		System.out.println("LossPercentage   :"+LossPercentage+"%");

		}
		else if(Sellingprice<Costprice) 
		{
			float Profit          =Sellingprice-Costprice;
			float Loss            =Costprice-Sellingprice;
			float ProfitPercentage=(Profit/Costprice)*100;
			float LossPercentage  =(Loss/Costprice)*100;
			System.out.println("Profit           :RS"+Profit);
			System.out.println("Loss             :RS"+Loss);
			System.out.println("ProfitPercentage :"+ProfitPercentage+"%");
			System.out.println("LossPercentage   :"+LossPercentage+"%");
			
		}

		
	}

}

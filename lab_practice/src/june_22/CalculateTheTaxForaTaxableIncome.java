package june_22;

public class CalculateTheTaxForaTaxableIncome {

	public static void main(String[] args) {
		int income=(int)990000;
		float Taxrate=(float)4.9;
		float TaxableIncome = Taxrate/100;
		float Incomeaftertax = TaxableIncome*income;
		System.out.println("taxable income="+Incomeaftertax);
		
		

	}

}

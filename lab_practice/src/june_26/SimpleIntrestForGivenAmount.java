package june_26;

public class SimpleIntrestForGivenAmount {

	public static void main(String[] args) {
		double    Principal       =100000;
		double    RateOfIntrest   =2;
		double    Time            =12;
		double    Intrest         =(Principal*RateOfIntrest*Time)/100;
		double    Amount          =Principal+Intrest;
		System.out.println("SimpleIntrest:"+Intrest);
		System.out.println("Amount       :"+Amount);

	}
}

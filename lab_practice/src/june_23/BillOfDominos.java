package june_23;

public class BillOfDominos {

	public static void main(String[] args) {
		System.out.println("----------------DOMINOS----------------");
		System.out.println("                AMEERPET            ");
		System.out.println("        BILL FOR ITEMS PURCHASED");
		System.out.println("----------------------------------------------------");
		System.out.println(" Items          quantity   price        total      ");
		int ck=4*60;
		System.out.println(" Chiken Rolls      4         60   =   rs " + ck);
		int vp=3*25;
		System.out.println(" Vegetable Pufs    3         25   =   rs " + vp);
		System.out.println("-----------------------------------------------------");
		int yd=50;
		System.out.println("       yoga Day Discount          =   rs " + yd);
		int fb=ck+vp-yd;
		System.out.println("        Final Bill Amount         =   rs " + fb);
		

	}

}

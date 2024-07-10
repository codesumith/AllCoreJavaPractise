package june_23;

public class FarenhitToCelsisus {

	public static void main(String[] args) {
		int Farenhit=Integer.parseInt(args[0]);
		System.out.println("Farenhit="+Farenhit);
		double celsius=(Farenhit-32)*5/9;
		System.out.println("farenhit to celsius="+celsius);
		/*int cel=Integer.parseInt(args[1]);
		System.out.println("celsius="+cel);
		double farenhit=cel*1.8+32;
		System.out.println("celsius to farenhit="+farenhit);*/
	}

}

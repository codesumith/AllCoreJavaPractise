package june8thtestPaper;

import java.util.Scanner;

public class CovertingSecondsToHoursMinutes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of seconds:");
		int seconds=sc.nextInt();
		
		int hours=seconds/3600;
		int minutes=(seconds%3600)/60;
		int sec= seconds%60;
		System.out.println("Hours:"+hours);
		System.out.println("Minutes:"+minutes);
		System.out.println("seconds:"+sec);
		
		sc.close();

	}

}

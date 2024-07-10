package com.sumith.sports;

import java.util.Scanner;

public class Soccer extends Sports{
	
	@Override
public String getName(String s) {
		//s="soccer";
		return s;
	}
	
	@Override
public String getNumberOfTeamNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sports name ");
		String sports = input.nextLine();
		System.out.println("Enter no of players");
		int numop=input.nextInt();
		input.close();
		return "In sports "+getName(sports)+" each team has "+ numop+" players";
		
	}

}

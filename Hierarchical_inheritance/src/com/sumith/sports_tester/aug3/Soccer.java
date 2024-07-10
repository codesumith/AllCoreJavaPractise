package com.sumith.sports_tester.aug3;

public class Soccer extends Sports{
	@Override
	String getName(String name)
   	{
      	//Write Logic Here
		return name;
   	}
@Override
	String getNumberOfTeamMembers(int n)
   	{
       		//Write Logic Here
	return "In "+ this.getClass().getSimpleName()+",each team has "+ n+" players";
   	}

}

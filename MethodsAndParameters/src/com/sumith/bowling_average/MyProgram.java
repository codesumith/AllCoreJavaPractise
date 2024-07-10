package com.sumith.bowling_average;

 class Bowler {
    //Declare 5 instance variable
	 String name;
	 int wickets;
	 int matches;
	 int balls_bowled;
	 int runs_conceded;
	 double bowlingavg;
	 float strikerate;
	
    Bowler(String cname,int cw,int cm,int bb,int rc){
        //Write initilization logic here
    	name=cname;
    	balls_bowled=bb;
    	matches=cm;
    	wickets=cw;
    	runs_conceded=rc;
    }
    public void computeBowlingAverage() {
        //Write your logic here
    	if(runs_conceded<0||wickets<0||balls_bowled<0||matches<=0) {
    		System.err.println("error");
    	}
    	
    	else {
    	System.out.println("name:"+name);
    	System.out.println("Bowlig_Average:"+(double)runs_conceded/wickets);
    	}
    }
     public void showStatistics() {
         //write your logic here
    	 if(runs_conceded<0||wickets<0||balls_bowled<0||matches<=0) {
     		System.err.println("error");
     	}
    	 else {
     		System.out.println("Cricketer [name="+name+",wickets="+wickets+",matches="+matches+",balls_bowled="+balls_bowled+",runs_conceded="+runs_conceded+"]");
    	 }
    	 }
     	
    	 
     public void computeStrikeRate() {
         //write your logic here
    	 if(runs_conceded<0||wickets<0||balls_bowled<0||matches<=0) {
     		System.err.println("error");
     	}
    	 else {
    	 System.out.println("name:"+name);
    	 System.out.println("strikerate:"+(float)runs_conceded/balls_bowled);
     }
     }
}
public class MyProgram
{
    public static void main(String[] args)
    {
      Bowler b = new Bowler ("sachin",10,5,750,463);
      b.computeBowlingAverage();
      b.showStatistics();
      b.computeStrikeRate();
     
      
     
      
    	
    }
}
package com.sumith.nov11;

public class SampleThread extends Thread
{
	
//	public static void main(String[] args) {
//		
//		
//		for(int i=1 ;i<=5;i++)
//		{
//			int a=0,b=1,c=0;
//			for(int j=1;j<=i;j++)
//			{
//				a=b;//1
//				b=c;//0
//				System.out.print(c+" ");
//				c=a+b;//1+0,
//			}
//			System.out.println();
//		}
		
		
			public void run(){
			System.out.println("run");
			}
			public void start(){
			System.out.println("start");
			}
			public static void main (String []args){
			SampleThread st=new SampleThread();
			st.start();
			System.out.println("end main");
			}
			
			}




	



package com.sumith.labwork_sep26;


class ThreadGroupTest13 extends Thread {
	
public void run()
{
System.out.println("Thread is running");

}

public static void main(String[] args){
	
	
ThreadGroup tg = new ThreadGroup("First Group");

//MyThread obj=new MyThread();


//Thread t1=new Thread(tg,obj,"First Thread");
//Thread t2=new Thread(tg,obj,"Second Thread");
//Thread t3=new Thread(tg,obj,"Third Thread");

tg.setMaxPriority(7);

System.out.println(tg.getName());

}
}




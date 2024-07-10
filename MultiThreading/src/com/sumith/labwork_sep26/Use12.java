
package com.sumith.labwork_sep26;
import java.io.IOException;
//import java.util.Collections;
//import java.util.Vector;

class MyThread extends Thread 
{
	
public boolean stop=true;

public void run()
{
	
	
for(int i=1;i<10;i++)
{
System.out.print(i+" ");

if(stop == false)
{
return;
}

}

}

}
public class Use12{
public static void main(String args[])throws IOException
{
MyThread mt=new MyThread();
mt.start();

System.out.print("Press Enter to Stop Thread:");

System.in.read();


mt.stop=false;
}

}
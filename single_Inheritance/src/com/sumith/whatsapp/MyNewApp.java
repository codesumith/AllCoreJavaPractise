package com.sumith.whatsapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class MyNewApp {
	
	

	public static void main(String[] args) throws AWTException, InterruptedException {
		int x=0;
		
		Robot robot = new Robot();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the message :");
		String msg =sc.nextLine();
		
		//System.out.print("Enter how many times you want to send : ");
		//int size =sc.nextInt();
		
		StringSelection st= new StringSelection(msg);
		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		//cb.setContents(st , null);
		
		
		System.out.println("The spamming will start in 5 seconds");
		Thread.sleep(5000);
		
		while(x<=10){
			
			Thread.sleep(1000);
			
			cb.setContents(st,null);	
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		x++; 
		
	}
		sc.close();
	}
}
	
	
	

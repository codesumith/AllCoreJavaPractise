package com.sumith.lab_work_sep29;
class Account {
 //Write the logic to perform the operation as per the requirement   
 int balance=5000;;
 
 public synchronized void  deposit(int amount)
 {
     amount+=balance;
     System.out.println("Amount deposited succefully by:"+Thread.currentThread().getName());
 }
 
 public void withdraw(int amount)
 {
     amount-=balance;
      System.out.println("Amount withdraw succefully by:"+Thread.currentThread().getName());
 }
 
}


public class AccountTester {
    public static void main(String[] args) {
        
        Account a=new Account();
        
        Thread t1=new Thread()
        {
            public void run()
            {
                a.deposit(1000);
                a.withdraw(2000);
            }
        };
        
        t1.start();
        
        
        Thread t2=new Thread()
        {
            public void run()
            {
                a.deposit(1000);
                a.withdraw(2000);
            }
        };
        
        t2.start();
    }
}

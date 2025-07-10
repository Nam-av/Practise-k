package com.sample;

import java.util.Scanner;

public class MethodUsage {
	
	static double balance=0.00;
	static Scanner scanner= new Scanner(System.in); 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         
         
         boolean isrunning=true;
         
         int choice=0;
         
       
        
         while(isrunning)
         {
        	 
	  System.out.println("*******************************");
      System.out.println("1.show balance");
      System.out.println("2. Deposit");
      System.out.println("3.Wihtdrawal");
      System.out.println("4.Exit");
      System.out.println("*******************************");
        choice=scanner.nextInt();
         switch(choice)
         {
        	 case 1:showbalance();
        	 		break;
        	 case 2:balance+=deposit();
        	        break;
        	 case 3:balance=balance-withdrawal();
        	        break;
        	 case 4:isrunning=false;
        	 		break;
        	 default:System.out.println("Invalid choice");
        	        break;
         }
         System.out.println("Have a Nice day!!");
         }
	  scanner.close();
	}
	static void showbalance()
	{
		System.out.println("The current balance is"+balance);
	}

	static double deposit()
	{
		
		double deposit=0.00;
		System.out.println("Enter the amount to be deposited ");
		deposit=scanner.nextDouble();
		if(deposit<0)
			{System.out.println("Amount cannot be less than zero");
		    return 0; 
			}
		else
		{
			return deposit;
		}
		//scan.close();
	}
	static double withdrawal()
	{
		double amount=0.00;
		System.out.println("Enter the amount to be deposited ");
		amount=scanner.nextDouble();
		
		if(amount<0)
		{System.out.println("Amount cannot be less than zero");
		 return 0;
		}
		else if(amount>balance)
		{ 
			System.out.println("Insufficient balance!!!");
		    return 0;
		}
		else
			return amount;
	}
	
}

package com.in.irise;
import java.util.*;

public class IriseApp {

	public IriseApp() 
	{
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = Sc.nextLine();
		
		System.out.println("Welcome "+name+" to Irise UPI App");
		
	
		long initialamount = 1000;
		int amount = 0;
		
		System.out.println("------------------------Enter 1 for Credit---------------------");
		System.out.println("------------------------Enter 2 for Debit---------------------");
		int value = Sc.nextInt();
		System.out.println("Enter an Amount");
		amount = Sc.nextInt();
		
		switch(value)
		{
		case 1:
			Credit( initialamount ,  amount);
			break;
			
		case 2 :
			Debit( initialamount , amount);
			break;
		default:
			System.out.println("Invalid Input");
			break;
			
		}
		
	}
	public static void Credit(long initial,int amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid amount.");
		}
		else
		{
			initial +=amount;
			System.out.println("Congratulations you have Credited "+amount+" Rs in your account.");
			System.out.println("Total Balance is :"+initial+" Rs.");
		}
	}
	
	public static void Debit(long initial,int amount)
	{
		if(initial<amount)
		{
			System.out.println("Insufficient Amount");
			return;
		}
		if(amount<=0)
		{
			System.out.println("Invalid amount.");
		}
		else
		{
			initial -=amount;
			System.out.println("Congratulations you have Debited "+amount+" Rs From your account.");
			System.out.println("Total Balance is :"+initial+" Rs.");
		}
	}
	
	
	

}

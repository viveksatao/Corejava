package LoopsFor;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) 
	{
		//14. Write a program to find the factorial value of any number.
		System.out.println("Write a program to find the factorial value of any number.");
		long Fact = 1;
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Number for which uou have to calculate its Factorial:");
		int num3 = Sc.nextInt();
		for(int k = num3 ;k>=1;k--)
		{
			Fact=Fact*k;
		}
		System.out.println("Factorial of "+num3+" is "+Fact);
	}

}

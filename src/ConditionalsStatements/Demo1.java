package ConditionalsStatements;

import java.util.Scanner;

public class Demo1 {

	// if number is even then check wheather  it is divisible by 10 or not
	// it is difficult to convert Nested if else block into one line using && operator but We can easily  Nested if  block into one line using && operator 
	public static void main(String[] args)
	{
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = Sc.nextInt();
		if(n%2==0)
		{
			if(n%10==0)
			{
				System.out.println("Number is even as well as divisible by 10");
			}
			else
			{
				System.out.println("Number is even but NOT divisible by 10");
			}
		}
		else
		{
			System.out.println(n+" is Odd");
		}
	}


}

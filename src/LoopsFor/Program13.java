package LoopsFor;

import java.util.Scanner;

public class Program13 {

public static void main(String[] args) 
{
	// . Write a program to find sum of all odd numbers between 1 to n
	System.out.println(". Write a program to find sum of all odd numbers between 1 to n");
	System.out.println("Enter a Number");
	Scanner Sc = new Scanner(System.in);
	int n = Sc.nextInt();
	long sum2 = 0L;
	for(int j = 1;j<n;j++)
	{if(j%2==1)
	{
		sum2+=j;
	}

	}
	System.out.println("Sum of all Odd number from 1 to "+n+" is"+sum2);
	System.out.println();
}

}

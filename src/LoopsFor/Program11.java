package LoopsFor;
import java.util.*;

public class Program11 {

	public static void main(String[] args) 
	{
		//Write a program to find sum of all natural numbers between 1 to n.
		Scanner Sc = new Scanner(System.in);
		System.out.println("Write a program to find sum of all natural numbers between 1 to n.");
		System.out.println("Enter Number:");
		int n = Sc.nextInt();
		long sum = 0;
		for(int j = 1;j<n;j++)
		{
			sum+=j;
		}
		System.out.println("Sum of all number from 1 to "+n+" is"+sum);
		
		System.out.println();
	}

}

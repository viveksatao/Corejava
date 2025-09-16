package LoopsFor;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) 
	{
		// Write a program to print all natural numbers from 1 to n (n is a user input).
		System.out.println("// Write a program to print all natural numbers from 1 to n (n is a user input).");
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = Sc.nextInt();
		for(int i = 1;i<=number;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		// Write a program to print all natural numbers in reverse from 100
        System.out.println("Write a program to print all natural numbers in reverse from 100");
		for(int i = 100;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Write a program to print tables by taking user input
		System.out.println("//Write a program to print tables by taking user input");
		System.out.println("Enter Number:");
		int num = Sc.nextInt();
		System.out.println("Table of "+num+" is");
		for(int i = 1;i<=10;i++)
		{
			System.out.print(i*num+" ");
		}
		System.out.println();
		//Write a program to print reverse tables by taking user input
		System.out.println("Write a program to print reverse tables by taking user input");
		System.out.println("Table of "+num+" in reverse order is ");
		for(int i = 10;i>=1;i--)
		{
			System.out.print(i*num+" ");
		}
		System.out.println();
		//5. Write a program to print all alphabets from a to z.
		System.out.println("Write a program to print all alphabets from a to z.");
		
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch+" ");
		}
		
		System.out.println();
		System.out.println("// Write a program to print reverse alphabets from Z to A");
		// Write a program to print reverse alphabets from Z to A
		for(char ch='Z';ch>='A';ch--)
		{
			System.out.print(ch+" ");
		}
		// Write a program to print all even numbers between 1 to 100 using if condition
		System.out.println("Write a program to print all even numbers between 1 to 100 using if condition");
		System.out.println("Even Numbers between 1 to 100 are as Follows");
		for(int i = 0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}	
		}
		System.out.println();
		
		//Write a program to print all even numbers between 1 to 100 without using if condition
		System.out.println("//Write a program to print all even numbers between 1 to 100 without using if condition");
		for(int i = 0;i<=100;i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//9. Write a program to print all odd numbers between 1 to 100 using if condition
		System.out.println("//9. Write a program to print all odd numbers between 1 to 100 using if condition");
		System.out.println("Odd Numbers between 1 to 100 are as Follows");
		for(int i = 0;i<=100;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		
			System.out.println();
      	// 10. Write a program to print all odd numbers between 1 to 100 without using if condition.
			System.out.println("10. Write a program to print all odd numbers between 1 to 100 without using if condition.");
			for(int a= 1;a<=100;a=a+2)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			
			//Write a program to find sum of all natural numbers between 1 to n.
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
			
			// Write a program to find sum of all even numbers between 1 to n
			System.out.println("Write a program to find sum of all even numbers between 1 to n");
			long sum1 = 0;
			for(int j = 1;j<n;j++)
			{if(j%2==0)
			{
				sum+=j;
			}
		
			}
			System.out.println("Sum of all Even number from 1 to "+n+" is"+sum1);
			System.out.println();
			
			// . Write a program to find sum of all odd numbers between 1 to n
			System.out.println(". Write a program to find sum of all odd numbers between 1 to n");
			long sum2 = 0;
			for(int j = 1;j<n;j++)
			{if(j%2==1)
			{
				sum+=j;
			}
		
			}
			System.out.println("Sum of all Odd number from 1 to "+n+" is"+sum2);
			System.out.println();
			
			//14. Write a program to find the factorial value of any number.
			System.out.println("Write a program to find the factorial value of any number.");
			long Fact = 1;
			System.out.println("Enter Number for which uou have to calculate its Factorial:");
			int num3 = Sc.nextInt();
			for(int k = num3 ;k>=0;k--)
			{
				Fact=Fact*k;
			}
			System.out.println("Factorial of "+num3+" is "+Fact);
			
			
			
			
		
		
	}

}
}

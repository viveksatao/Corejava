package LoopsFor;
import java.util.*;


public class Program12 {

	public static void main(String[] args)
	{
		// Write a program to find sum of all even numbers between 1 to n
					System.out.println("Write a program to find sum of all even numbers between 1 to n");
					
					long sum1 = 0;
					System.out.println("Enter a Number");
					Scanner Sc = new Scanner(System.in);
					int n = Sc.nextInt();
					for(int j = 1;j<n;j++)
					{if(j%2==0)
					{
						sum1+=j;
					}
				
					}
					System.out.println("Sum of all Even number from 1 to "+n+" is"+sum1);
	}

}

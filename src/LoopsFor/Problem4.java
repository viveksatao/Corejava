package LoopsFor;
import java.util.*;

public class Problem4 {

	public static void main(String[] args) 
	{
	//Write a program to print tables by taking user input
			System.out.println("//Write a program to print tables by taking user input");
			System.out.println("Enter Number:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("Table of "+num+" is");
			for(int i = 1;i<=10;i++)
			{
				System.out.print(i*num+" ");
			}
			System.out.println();
		
	}

}

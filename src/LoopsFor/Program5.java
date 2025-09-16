package LoopsFor;
import java.util.*;

public class Program5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Write a program to print reverse tables by taking user input
		System.out.println("Write a program to print reverse tables by taking user input");
		int num = sc.nextInt();
		System.out.println("Table of "+num+" in reverse order is ");
		for(int i = 10;i>=1;i--)
		{
			System.out.print(i*num+" ");
		}
		System.out.println();
	}

}

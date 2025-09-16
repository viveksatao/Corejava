package LoopsFor;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int base = Sc.nextInt();
		int power = 3;
		long result = 1;
		for(int i = 1;i<=power;i++)
		{
			result = result*base;
		}
		System.out.println("Cube of "+base+" is "+result);
	}

}

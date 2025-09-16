package WhileLoop;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		int sumdigit = 0;
		int rem = 0;
		
		while(n!=0)
		{
			rem = n%10;
			n = n/10;
			sumdigit+=rem;
		}
		System.out.println("Sum of Digits  is :"+sumdigit);
	}

}

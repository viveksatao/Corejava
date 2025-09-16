package WhileLoop;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		int Original = n;
		int rem = 0;
		int rev = 0;
		
		while(n!=0)
		{
			rem = n%10;
			rev = rem+rev*10;
			n = n/10;
		}
		if(rev==Original)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is NOT Palindrome");
		}
	}


}

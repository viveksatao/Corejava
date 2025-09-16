package WhileLoop;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		int rem = 0;
		long productdigit = 1L;
		
		while(n!=0)
		{
			rem = n%10;
			productdigit*=rem;
			n = n/10;
		}
		System.out.println("The product of digits in a number :"+productdigit);
	}

}

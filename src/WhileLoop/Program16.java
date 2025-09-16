package WhileLoop;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		long fact = 1L;
		int i= n;
		while(i!=0)
		{
			fact= fact*i;
			i--;
		}
		System.out.println("Factorial is :"+fact);
	}

}

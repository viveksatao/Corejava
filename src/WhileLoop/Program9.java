package WhileLoop;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args)
	{
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
	}

}

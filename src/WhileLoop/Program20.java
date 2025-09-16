package WhileLoop;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		int rem = 0;
		int largernum = 0;
		if(n<=0)
		{
			n=-n;
		}
		
		while(n!=0)
		{
			rem = n%10;
			if(rem>=largernum)
			{
				largernum=rem;
			}
			n = n/10;
		}
		System.out.println("The greatest digit in a number :"+largernum);
	}

}


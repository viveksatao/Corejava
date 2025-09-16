package WhileLoop;

import java.util.Scanner;

public class Program10 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = Sc.nextInt();
	int count = 0;
	int i = 1;
	while(i<=n)
	{
		count+=i;
		i++;
	}
	System.out.println("Sum of First "+n+" number is :"+count);
}

}

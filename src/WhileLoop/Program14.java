package WhileLoop;

import java.util.Scanner;

public class Program14 
{
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = Sc.nextInt();
	int countdigit = 0;
	
	while(n!=0)
	{
		n = n/10;
		countdigit++;
	}
	System.out.println("Number of Digits  is :"+countdigit);
}
	

}

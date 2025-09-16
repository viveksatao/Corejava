package LoopsFor;
import java.util.Scanner;

public class Program16 
{
public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter number");
	int base = Sc.nextInt();
	int rev = 0;
	int rem = 0;
	while(base!=0)
	{
		rem = base%10;
		rev = rem+rev*10;
		base = base/10;
	}
	System.out.println(rev);
}
	

}

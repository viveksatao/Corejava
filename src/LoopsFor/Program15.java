package LoopsFor;
import java.util.*;

public class Program15
{
public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Base");
	int base = Sc.nextInt();
	System.out.println("Enter Power");
	int power = Sc.nextInt();
	long result = 1;
	for(int i = 1;i<=power;i++)
	{
		result = result*base;
	}
	System.out.println(result);
	
}
	

}

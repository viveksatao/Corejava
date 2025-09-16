package ConditionalsStatements;
import java.util.*;

public class Demo 
{

	public static void main(String[] args)
	{
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = Sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is Even");
		}
		else
		{
			System.out.println(n+" is Odd");
		}
	}

}

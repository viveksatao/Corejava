package ConditionalsStatements;
import java.util.*;

public class Marksheet 
{	
public static void main(String[] args)
{
	Scanner Sc = new Scanner(System.in);
	
	System.out.println("Enter the Marks of Student:");
	int Marks = Sc.nextInt();
	if(Marks<0 || Marks>100)
	{
		System.out.println("Invalid Input");
	}
	
	else if(Marks>=40 && Marks<=100)
	{
		if(Marks>=80)
		{
			System.out.println("Student will pass with Distinction");
		}
	}
	else
	{
		System.out.println("Student will gets Failed");
	}
		
	Sc.close();
}

}

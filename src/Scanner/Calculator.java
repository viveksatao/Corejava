package Scanner;
import java.util.*;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter FIrst Value:");
		int no1 = Sc.nextInt();
		System.out.println("Enter Second  Value:");
		int no2 = Sc.nextInt();
		
		System.out.println("enter the character:");
		
		
		Calculator cobj = new Calculator();
		
		cobj.printSum(no1, no2);
		
		cobj.printSub(no1, no2);
		
		cobj.printMul(no1, no2);
		
		cobj.printDiv(no1, no2);
		
	}
	
	public void printSum(int a , int b)
	{
		int sum = a+b;
		System.out.println("Addition of a and b is :"+sum);
	}
	
	public void printSub(int a , int b)
	{
		int sum = a-b;
		System.out.println("Substraction of a and b is :"+sum);
	}
	
	public void printMul(int a , int b)
	{
		int sum = a*b;
		System.out.println("Multiplication of a and b is :"+sum);
	}
	
	public void printDiv(int a , int b)
	{
		int sum = a/b;
		System.out.println("Division of a and b is :"+sum);
	}
	
}



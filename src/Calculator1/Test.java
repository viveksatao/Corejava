package Calculator1;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of x");
		int x = Sc.nextInt();
		
		System.out.println("Enter the Value of y");
		int y = Sc.nextInt();
		
		
		Main aobj = new Main(x,y);
		
		System.out.println(aobj.Addition());
		
		System.out.println(aobj.Division());
		
		System.out.println(aobj.Multiplication());
		
		System.out.println(aobj.Substraction());
		
		
		
		
	}
}

package Calculator;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of x");
		int x = Sc.nextInt();
		
		System.out.println("Enter the Value of y");
		int y = Sc.nextInt();
		
		
		Addition aobj = new Addition(x,y);
		System.out.println(aobj.getSum());
		
		Substraction sobj = new Substraction(x,y);
		System.out.println(sobj.getSub());
		
		Multiplication mobj = new Multiplication(x, y);
		System.out.println(mobj.getMul());
		
		Division dobj = new Division(x,y);
		System.out.println(dobj.getDiv());
	}

}

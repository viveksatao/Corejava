package exception;

import java.io.*;

public class Demo4 {

	public static void main(String[] args) throws ArithmeticException
	{
		
		
			Demo4 d = new Demo4();
			
			try
			{
			d.div();
			}
			catch(ArithmeticException e)
			{
			e.printStackTrace();
			}
			System.out.println("END");
			
			
////		Exception Propogation
//try
//{
//anything();
//}
//catch(FileNotFoundException e)
//{
//e.printStackTrace();
//}
//}
//
//public static void anything() throws FileNotFoundException
//{
//something();
//}
//public static void something() throws FileNotFoundException
//{
//FileReader fobj = new FileReader("text.txt");	
//}

			
			}
		
		public void div() throws ArithmeticException
		{
			int a = 12/0;
		}
}


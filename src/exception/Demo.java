package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		              //Compile time exception 
		
		//Compile time exception need to be handle
		try
		{
		FileReader reader = new FileReader("text.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//finally block is maninly used for releasing Resourcess which consumes memory
		// between try and catch block we cannot write code 
		// we can write multiple catch block
		// we can write nested try block
		// we cannot use try catch block inside conditional statements 
		// child catch block must be written before parent catch block if we do then compiler will give you error that child catch block gets unreacheble
		//each exception has parameterised constructor which can take string input
		
		
		//Runtime Exception
		
//		handling Runtime xception is optional
//		System.err.println("Code started");
//		int a = 12;
//		Scanner Sc = new Scanner(System.in);
//		int value = Sc.nextInt();
//		
//		try {
//			System.out.println(a/value);
//		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			System.out.println("Finally block executed");
//		}
		
	}

}

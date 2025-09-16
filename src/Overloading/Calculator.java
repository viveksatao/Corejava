package Overloading;

public class Calculator {

	//METHOD OVERLOADING IS COMPILE-TIME POLYMORPHISM
	//We can also overload Static methods
	
	int a;
	
	public Calculator()
	{
		a = 12;
	}
	public  Calculator(int a )
	{
		this.a = a;
	}
	
	public  int Addition(int a , int b)
	{
		return a+b;
	}
	public  int Addition(int a , int b , int c)
	{
		return a+b+c;
	}
	public double Addition(int a , double b)
	{
		return a+b;
	}
	public double Addition(double b , int a)
	{
		return a+b;
	}

}


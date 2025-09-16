package Overloading;

public class Demo {
	
	
	public static void main(String[] args) 
	{
		Calculator cobj = new Calculator();
		int result = cobj.Addition(0, 0);
		result = cobj.Addition(0, 0, 0);
		double ans = cobj.Addition(0, 0);
		ans = cobj.Addition(12, 12.23);
		
		

    System.out.println(cobj.a);
    Calculator cobj1 = new Calculator(19);
    System.out.println(cobj1.a);
		
	}
}



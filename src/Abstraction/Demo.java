package Abstraction;
import java.util.*;

public class Demo {

	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 1 for Manager & Enter 2 For HR whose salary you have to deduct : ");
		
		int Str= Sc.nextInt();
		if(Str>2 || Str<=0)
		{
		System.err.println("Enter Valid Number:");
		}
		else
		{
			Employee e;
			double salary;
			if(Str==1)
			{
			System.out.println("Enter the salary of manager");
			salary = Sc.nextDouble();
			e = new Manager(salary);
			e.printSalary();
			}
			else
			{
				System.out.println("Enter the salary of HR");
				salary = Sc.nextDouble();
				e = new HR(salary);
				e.printSalary();
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "hr";
//		Employee e;
//		
//		if(str.equalsIgnoreCase("manager"))
//		{
//			e = new Manager();
//			e.printSalary();
//		}
//		else
//		{
//			e = new HR();
//			e.printSalary();
//		}
	}

}

package Abstraction;

public class HR extends Employee {

	double salary;
	
	public HR(double salary)
	{ 
		this.salary = salary;
	}
	@Override
	public void printSalary() 
	{
		this.salary = this.salary - (this.salary*0.1);
		System.out.println("HR salary after 10% Deduction is:"+salary);
		
	}

}

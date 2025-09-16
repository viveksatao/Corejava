package Abstraction;

public class Manager extends Employee {

	double salary;
	
	public Manager(double salary)
	{
		this.salary = salary;
	}
	@Override
	public void printSalary() 
	{
		this.salary = this.salary - (this.salary*0.1);
		System.out.println("Manager salary after 10% Deduction is:"+salary);
		
	}

	

}

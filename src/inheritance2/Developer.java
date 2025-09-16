package inheritance2;

public class Developer extends Employee
{
	public Developer()
	{
		System.out.println("Inside Developer Constructor");
	}

int age = 23;
int empId = 110;

public void printProject()
{
	System.out.println("Google");
}

@Override
public void printCity() {
	// TODO Auto-generated method stub
	super.printCity();
	System.out.println("PUNE");
}



}

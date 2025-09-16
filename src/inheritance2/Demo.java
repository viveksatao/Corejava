package inheritance2;

public class Demo {

	public static void main(String[] args) 
	{
		Employee eobj = new Developer();
		System.out.println(eobj.empid);
		System.out.println(eobj.name);
		eobj.printCity();
		eobj.printSalary();
		
		Developer.printVehicle();
		// Child class can access parent class static method 
		System.out.println(Developer.abc);
	}

}

package Inheritance;

public class Tiger extends Animal{

	public Tiger() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Tiger Constructor");
	}
	public void printColor()
	{
		System.out.println("orange with black stripes");
	}
	@Override
	public void printName() {
		
		System.out.println("Tiger");
	}
	

}

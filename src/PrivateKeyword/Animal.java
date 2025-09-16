package PrivateKeyword;

public class Animal {
	

private int age = 32;

private Animal()
{
	System.out.println("Inside Constructor");
}
// if we dont want to allow to create object of any class then make its constructor as Private
// if we dont want to allow to create object more than one then is called Singleton Design 
	
	private void printName()
	{
		System.out.println("Lion");
	}
	public void Task()
	{
		printName();
		System.out.println(age);
	}

}

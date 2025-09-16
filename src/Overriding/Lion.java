package Overriding;

public class Lion  extends Animal{

	
	int number  = 123;
	
	public Lion() {
		this(23); // it should be at first number 
	System.out.println("In lion constructor");
	
	}
	// this is also used to call one method from another method of same class as we are seeing at line no. 28
	public Lion(int a)
	{
		System.out.println("a in Para Constructor is :"+a);
	}
	
	//when we call one constructor from other constructor is known as Constructor chainning
	public void printColor()
	{
		System.out.println("Orange black Stripper");
		super.printName();
	}
	public void something()
	{
		System.out.println("Something Method");
		System.out.println(this.number);
		this.printName();
		this.printColor();
		
	}
	@Override
   public void printName()
   {
	   System.out.println("Lion");
   }
	
   
}

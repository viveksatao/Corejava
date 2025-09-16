package staticKeyword;

public class Animal 
{
static int age;
static{
	age = 24;
	System.out.println("Static Block");
}
// when class gets loaded then automatically static block will execute.
// we can define multiple static blocks but it is not good programming practice
// First of all Static block will Execute then constructor will execute
public static void printName()
{
	System.out.println("Tiger");
}
public Animal()
{
	System.out.println("Inside Constructor");
}
static{
	System.out.println("Static Block 2");
}
	
}

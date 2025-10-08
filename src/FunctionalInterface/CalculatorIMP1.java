package FunctionalInterface;

public class CalculatorIMP1 {

	public static void main(String[] args) {
		
		FunctionalInterfaceCalculator addition = (a,b)->
		{
			System.out.println("Addition is :"+(a+b));
		};
		addition.operation(20, 30);
		
		FunctionalInterfaceCalculator substraction = (a,b)->
		{
			System.out.println("substraction is :"+(a-b));
		};
		substraction.operation(50, 30);
		
		FunctionalInterfaceCalculator multiplication = (a,b)->
		{
			System.out.println("multiplication is :"+(a*b));
		};
		multiplication.operation(20, 2);
		
		FunctionalInterfaceCalculator division = (a,b)->
		{
			System.out.println("Division is :"+(a/b));
		};
		division.operation(10, 5);
		
		
		
		
	}

}

package FunctionalInterface;

public class Test {

	public static void main(String[] args) {
		FIReturnType f = (a,b)->
		{
			return a-b;
		};
		System.out.println("Substraction is :"+f.substract(30, 10));
	}

}

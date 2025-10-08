package FunctionalInterface;

public class AddtionIMP1 
{
 
//	public void addition(int a , int b)
//	{
//		System.out.println("Addition is :"+(a+b));
//	}
	
	public static void main(String[] args) {
		
		FIAddtion f = (a ,b)->
		
		// ()->{} this syntax is Known as Lambda Expression
		{
			System.out.println("Addition is :"+(a+b));
		};
		f.addition(20, 30);
	}

}

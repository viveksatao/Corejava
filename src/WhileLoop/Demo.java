package WhileLoop;

public class Demo {

	public static void main(String[] args)
	{
		int i = 1;
		while(i<=10)
		{
			if(i==5)
			{
				i++;
				continue;
			}
			System.out.print(i+" ");
			i++;
		}
		
	}

}

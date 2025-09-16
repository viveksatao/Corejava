package WhileLoop;
import java.util.*;
public class Program8 {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = Sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			
			System.out.print(i*i*i+" ");
			i++;
		}
	}

}

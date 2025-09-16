package DoWhile;
import java.util.*;
public class Program1 
{
public static void main(String[] args) 
{
//	 8. Print numbers from 1 to 
//	 n but skip multiples of 5
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = Sc.nextInt();
	int i = 1;
	do
	{
		if(i==5)
		{
			i++;
			continue;
		}
		System.out.print(i+" ");
		i++;
		
	}
	while(i<=n);
	
}
	

}

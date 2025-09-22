package collections;
import java.util.*;

//store even number from 1 to 20 and print it 
public class Demo2 {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int size = Sc.nextInt();
		List<Integer> list = new ArrayList<>(size);
		for(int i = 0;i<=20;i++)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
		System.out.println(list.toString());
		
	}

}

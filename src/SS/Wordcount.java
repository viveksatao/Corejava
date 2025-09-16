package SS;
import java.util.*;

public class Wordcount {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter an String");
		String name = Sc.nextLine();
		name = name.trim();
		int count = 1;
		
		for(int i = 0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("Number of Words in given String is :"+count);
		
	}
}


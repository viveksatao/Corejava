package StringAssignment;
import java.util.*;
public class Program2 {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String");
		String Str = Sc.nextLine();
		int countlowercase = 0;
		int countuppercase = 0;
		Str= Str.trim();
		for(int i = 0;i<Str.length();i++)
		{
			char ch = Str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				countuppercase++;
			}
			
			else if(ch>='a' && ch<='z')
			{
				countlowercase++;
			}
			
		}

		System.out.println("The Number of Uppercase charecters in this string are:"+countuppercase);
		System.out.println("The Number of Lowercase charecters in this string are:"+countlowercase);
	}

}

package StringAssignment;

import java.util.Scanner;

public class Program9 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String Str = Sc.nextLine();
	 StringBuilder result = new StringBuilder(Str);
	for(int i = 0;i<Str.length();i++)
	{
		char ch = result.charAt(i);
		if(ch>='a' && ch<='z')
		{
			ch =(char)(ch-32);
			result.setCharAt(i, ch);
		}
		else
		{
			ch =(char)(ch+32);
			result.setCharAt(i, ch);
		}
	}
	System.out.println(result);
	
}

}

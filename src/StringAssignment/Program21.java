package StringAssignment;

import java.util.Scanner;

public class Program21 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	StringBuilder Str = new StringBuilder();
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		if(ch==' ')
		{
			ch='-';
			Str.append(ch);
		}
		else
		{
			Str.append(ch);
		}
	}
	
	System.out.println(Str);
}
}

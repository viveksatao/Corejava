package StringAssignment;

import java.util.Scanner;

public class Program20 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	StringBuilder Str = new StringBuilder();
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		if(ch>='a' && ch<='z')
		{
			ch = (char)(ch-32);
			Str.append(ch);
		}
		else if(ch>='A' && ch<='Z')
		{
			ch = (char)(ch+32);
			Str.append(ch);
		}
	}
	System.out.println(Str);
}
}

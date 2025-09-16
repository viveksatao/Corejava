package StringAssignment;

import java.util.Scanner;

public class Program28 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	S = S.toLowerCase().trim();
	StringBuilder Str = new StringBuilder();
	
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		if(ch>='a' && ch<='z')
		{
			Str.append(ch);
		}
		else if(ch>='A' && ch<='Z')
		{
			Str.append(ch);
		}
		else if(ch>='0' && ch<='9')
		{
			Str.append(ch);
		}
	}
	System.out.println(Str);
}
}
	
	
package StringAssignment;

import java.util.Scanner;

public class Program24 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	
	StringBuilder Str = new StringBuilder();
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		int count = 0;
		int j = i;
		while(j<S.length() && S.charAt(j)==ch)
		{
				count++;
				j++;
		}
		i=j;
		Str.append(ch);
		Str.append(count);
		
	}
	
	
	System.out.println(Str);
}
}

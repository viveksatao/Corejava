package StringAssignment;

import java.util.Scanner;

public class Program25 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	S = S.toLowerCase();
	StringBuilder Str = new StringBuilder();
	int maxcount = 0;
	int secondmaxcount = 0;
	char maxchar = ' ';
	char secondmaxchar = ' ';
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		int count = 0;
		for(int j = 0;j<S.length();j++)
		{
			if(S.charAt(i)==S.charAt(j))
			{
				count++;
			}
		}
		if(count>1)
		{
			maxchar = ch;
			maxcount = count;
		}
	}
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		int count = 0;
		for(int j = 0;j<S.length();j++)
		{
			if(S.charAt(i)==S.charAt(j) && (S.charAt(i)!=maxchar))
			{
				count++;
			}
		}
		if(count>1 && maxcount>count )
		{
			secondmaxchar = ch;
			secondmaxcount = count;
		}
	}
	
	
	System.out.println(secondmaxchar);
	System.out.println(secondmaxcount);
}
}

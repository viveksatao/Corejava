package StringAssignment;

import java.util.Scanner;

public class Program17 
{
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	S = S.toLowerCase();
	int mincount = 0;
	char minchar = ' ';
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		int count = 0;
		
		for(int j = 0;j<S.length();j++)
		{
			if(ch==S.charAt(j))
			{
				count++;
			}
		}
		if(count==1)
		{
			minchar = ch;
			break;
		}
	}
	System.out.println("first non-repeating character is :"+minchar);
	
}
	

}

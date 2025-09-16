package StringAssignment;

import java.util.Scanner;

public class Program26 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	S = S.toLowerCase().trim();
	int count = 1;
	
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		
		if(ch==' ')
		{
			count++;
		}
	}
	
	
	System.out.println(count);
	
}
}

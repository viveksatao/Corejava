package StringAssignment;

import java.util.Scanner;

public class Program10 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	StringBuilder Str = new StringBuilder(S);
	int start = 0;
	int end = Str.length()-1;
	while(start<=end)
	{
		char temp = Str.charAt(start);
		  Str.setCharAt(start, Str.charAt(end));
          Str.setCharAt(end, temp);
		start++;
		end--;
	}
	String result = new String(Str);
	if(S.equals(result))
	{
	System.out.println("Given String is Palindrome");
	}
	else
	{
		System.out.println("Given String is NOT Palindrome");
	}

	
}

}

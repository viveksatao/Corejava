package StringAssignment;

import java.util.Scanner;

public class Program27 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	S = S.toLowerCase().trim();
	StringBuilder Str = new StringBuilder();
	StringBuilder word = new StringBuilder();
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		if(ch!=' ')
		{
			word.append(ch);
		}
		else
		{   
			Str.append(reverseString(word.toString()));
			Str.append(' ');
			word.setLength(0);
		}
		
	}
	
	if (word.length() > 0) {
        Str.append(reverseString(word.toString()));
    }
	
	System.out.println(Str);
}
public static String reverseString(String Str)
{
	char c[] = Str.toCharArray();
	int start = 0;
	int end = c.length-1;
	while(start<end)
	{
		char temp = c[start];
		c[start] = c[end];
		c[end] = temp;
		start++;
		end--;
	}
	return new String(c);
}
}


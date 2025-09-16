package StringAssignment;

import java.util.Scanner;

public class Program19
{
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String1");
	String S1 = Sc.nextLine();
	S1 = S1.toLowerCase();
	System.out.println("Enter String2");
	String S2 = Sc.nextLine();
	S2 = S2.toLowerCase();
	if(S1.length()!=S2.length())
	{
		System.out.println("S1 and S2 are NOT Anagrams");
	}
	
	S1 = sortString(S1);
	S2 = sortString(S2);
	if(S1.equals(S2))
	{
		System.out.println("S1 and S2 are Anagrams");
	}
	else
	{
		System.out.println("S1 and S2 are NOT Anagrams");
	}
	
}
	
public static String sortString(String Str)
{
	char ch[] = Str.toCharArray();
	for(int i = 0;i<ch.length-1;i++)
	{
		for(int j = i+1;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
			}
		}
	}
	return new String(ch);
}
}

package StringAssignment;

import java.util.Scanner;

public class Program14 {

public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	int count = 0;
	int othercount = 0;
	
	
	
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			count++;
		}
		else
		{
			othercount++;
		}
	}
	if(othercount!=0)
	{
		System.out.println("Given String is Not contains all characters are alphabetic ");
	}
	else
	{
		System.out.println("Given String is contains all characters are alphabetic ");
	}
	
	
}

}

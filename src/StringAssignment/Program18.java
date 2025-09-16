package StringAssignment;

import java.util.Scanner;

public class Program18
{
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	S = S.toLowerCase();
	StringBuilder Str = new StringBuilder();
	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		boolean found = false;
		
		for(int j = 0;j<Str.length();j++)
		{
			if(ch==Str.charAt(j))
			{
				found = true;
				break;
			}
		}
		if(!found)
		{
			Str.append(ch);
		}
	}
	System.out.println("After Removing Duplicates :"+Str);
	
}
	

}

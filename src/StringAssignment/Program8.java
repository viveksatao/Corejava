package StringAssignment;

import java.util.Scanner;

public class Program8 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String Str = Sc.nextLine();
	 StringBuilder result = new StringBuilder(Str);
	for(int i = 0;i<Str.length();i++)
	{
		char ch = result.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			result.setCharAt(i, '*');
		}
	}
	System.out.println(result);
	
}

}

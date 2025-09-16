package StringAssignment;

import java.util.Scanner;

public class Program16 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	int maxchar = ' ';
	int maxcount = 0;
	
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
		if(count>maxcount)
		{
			maxcount = count;
			maxchar = ch;
		}
	}
	System.out.println("Most frequent character: " + (char)maxchar);
    System.out.println("Frequency: " + maxcount);
}

}

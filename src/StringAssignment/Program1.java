package StringAssignment;
import java.util.*;
public class Program1 {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String");
		String Str = Sc.nextLine();
		int countvowels = 0;
		int countconsonents = 0;
		int countdigits = 0;
		int countspaces = 0;
		int countlowercase = 0;
		int countuppercase = 0;
		
		for(int i = 0;i<Str.length();i++)
		{
			char ch = Str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				countvowels++;
			}
			else if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
			{
				countdigits++;
			}
			else if(ch==' ')
			{
				countspaces++;
			}
			else
			{
				countconsonents++;
			}
		}
		System.out.println("The Number of Vowels in this string are:"+countvowels);
		System.out.println("The Number of Consonents in this string are:"+countconsonents);
		System.out.println("The Number of Digits in this string are:"+countdigits);
		System.out.println("The Number of Spaces in this string are:"+countspaces);
	}

}

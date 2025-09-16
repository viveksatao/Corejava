package StringAssignment;

import java.util.Scanner;

public class Program12 {

public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	StringBuilder Str = new StringBuilder(S);
	
	for(int i = 0;i<S.length();i++)
	{
		char ch = Str.charAt(i);
		if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
		{
			Str.setCharAt(i, '#');
		}
	}
	System.out.println(Str);
	
	
	
}

}

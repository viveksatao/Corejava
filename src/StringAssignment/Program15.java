package StringAssignment;

import java.util.Scanner;

public class Program15 {

public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String");
	String S = Sc.nextLine();
	long asciisum = 0;

	for(int i = 0;i<S.length();i++)
	{
		char ch = S.charAt(i);
		asciisum += (int)ch;
	}
	System.out.println(asciisum);
	
}

}

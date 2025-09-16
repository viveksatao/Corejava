package StringAssignment;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String");
		String S = Sc.nextLine();
		int countfrequency = 0;
		for(int i = 0;i<S.length();i++)
		{
			if(S.charAt(i)=='v' ||S.charAt(i)=='V' ){
				countfrequency++;
			}
		}
		System.out.println("Frequency of specific character V is:  "+countfrequency);
	}

}

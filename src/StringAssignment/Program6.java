package StringAssignment;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String");
		String Str = Sc.nextLine();
		System.out.println("Before Reverse: "+Str);
		System.out.print("After Reverse: ");
		for(int i = Str.length()-1;i>=0;i--)
		{
			System.out.print(Str.charAt(i));
		}
	}

}

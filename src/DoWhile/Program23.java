package DoWhile;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
	    String s = null;
		do
		{
		System.out.println("Enter a userid");
		 s = Sc.nextLine();
		 if(!s.equals("admin"))
		 {
			 System.out.println("Invalid Userid , Try Again");
			 
		 }
		}
		while(!s.equals("admin"));
		System.out.println("Exit");
	}

}

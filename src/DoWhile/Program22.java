package DoWhile;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
	    int n;
		do
		{
		System.out.println("Enter a NUmber");
		 n = Sc.nextInt();
		}
		while(n<=100);
		System.out.println("Exit");
	}

}

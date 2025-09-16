package SS;
import java.util.*;

public class UserNameCreator {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Your First Name:");
		String firstname = Sc.nextLine();
		System.out.println("Enter Your Last Name:");
		String lastname = Sc.nextLine();
		System.out.println("Enter Your BOY");
		int birthofyear = Sc.nextInt();
		if(birthofyear>=1925 && birthofyear<=2025)
		{
		String ch = birthofyear+"";
		for(int i = 0;i<4;i++)
		{
			System.out.print(firstname.charAt(i));
		}
		System.out.print(lastname.charAt(0));
		
		for(int i = 2;i<4;i++)
		{
			System.out.print(ch.charAt(i));
		}
		
		}
		else
		{
			System.out.println("Invalid Input.... ");
		}
		
	}

}

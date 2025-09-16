package SS;
import java.util.*;

public class Authenticator {

	public Authenticator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		String user = "viveksatao39@gmail.com";
		String Pass = "vivek@123";
		System.out.println("Enter your Username");
		String userid = Sc.nextLine();
		
		System.out.println("Enter your Password");
		String password = Sc.nextLine();
		if(user.equals(userid) && password.equals(Pass) )
		{
			System.out.println("Congratulatons , You have Login Successfully....");
		}
		else if(user.equals(userid))
		{
			System.out.println("Invalid Password");
		}
		else if(Pass.equals(password))
		{
			System.out.println("Invalid Userid");
		}
		else
		{
			System.out.println("Invalid Userid and Password");
		}
		
		
	}

}

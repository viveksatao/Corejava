package FileHandling;
import java.util.*;
import java.io.*;

public class TextFileWriter {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name  = Sc.next();
		System.out.println("Please enter your Year of birth:");
		int year = Sc.nextInt();
		
		String userName = name+year;
		System.out.println(userName);
		
		// We want to store this username in text file
		// text file creation will be taken care by java
		//writing in text file -> java
		// we need to specify location of file location
		
		//1.Directory path
		String directoryPath = "C:\\Users\\Vozon\\Desktop\\FileHandling";
		//2. file name
		String filename = "username.txt";
		//C:\\Users\\Vozon\\Desktop\\FileHandling\\username.txt
		File fobj = new File(directoryPath +"\\"+filename);
		
		// we should create a file if it is not there
		
		try
		{
			//Creation of File
			if(fobj.createNewFile())
			{
				System.out.println("File Created"); 
			}
			else
			{
				System.out.println("File Already Exists");
			}
			
			//Write into File ->
			//true is for append mode activation
			FileWriter writer = new FileWriter(fobj,true);
			writer.write(userName+System.lineSeparator());
			writer.close();
			FileReader reader = new FileReader(fobj);
			String ans = reader.getEncoding();
			System.out.println(ans);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		Sc.close();
		}
		
	}

}

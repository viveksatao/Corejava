package FileHandling;
import java.util.*;
import java.io.*;

public class TextFileReader 
{
public static void main(String[] args) 
{
	String filePath = "C:\\Users\\Vozon\\Desktop\\FileHandling\\vivek.txt";
	
	try
	{
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line;
		while((line = reader.readLine())!=null)
		{
			
			System.out.println(line);
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	

}

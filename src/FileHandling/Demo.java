package FileHandling;

import java.util.*;
import java.io.*;

public class Demo {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter First name of student");
		String firstName = Sc.nextLine();
		System.out.println("Enter Last name of student");
		String lasstName = Sc.nextLine();
		System.out.println("Enter Id of student");
		int id = Sc.nextInt();
		System.out.println("Enter the Mobile Number of Student:");
	    long mobilenumber = Sc.nextLong();
	    Sc.nextLine();
	    System.out.println("Enter the City of Student");
	    String city = Sc.nextLine();
	   
	    
	    Entity eobj = new Entity();
	    eobj.setId(id);
	    eobj.setCity(city);
	    eobj.setFirstName(firstName);
	    eobj.setLastName(lasstName);
	    eobj.setPhoneNumber(mobilenumber);
	    
	    String info = eobj.getId()+": "+eobj.getFirstName()+": "+eobj.getLastName()+": "+eobj.getPhoneNumber()+": "+eobj.getCity();
	    
	    System.out.println("Enter File name :");
	    String filename = Sc.nextLine();
	    filename = filename+".txt";
	    
	    String directorypath = "C:\\Users\\Vozon\\Desktop\\FileHandling";
	    File file = new File(directorypath+"\\"+filename);
	    
	    try {
	    if(file.createNewFile())
	    {
	    	System.out.println("File is Created");
	    }
	    else
	    {
	    	System.out.println("File is already exist");
	    }
	    FileWriter writer = new FileWriter(file,true);
	    writer.write(info+System.lineSeparator());
	    	 writer.close();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	

}

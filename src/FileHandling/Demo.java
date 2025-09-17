package FileHandling;

import java.util.*;
import java.io.*;

public class Demo {
static Scanner Sc = new Scanner(System.in);
public static void main(String[] args) 
	{
	System.out.println("Welcome to Student Portal...");
	System.out.println("Enter the Number of Student whose info you have to store in a file");
	int studentCount = Sc.nextInt();
	Sc.nextLine();
	int count = 1;
	while(count<=studentCount)
	{
		Demo tobj = new Demo();
		Entity eobj = tobj.getEntityObjectFromUser();
		try
		{
			String msg = tobj.updateFile(eobj);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		++count;
		
	}
	System.out.println("Total Student Added in file :"+(count-1));
	Sc.close();

//		System.out.println("Enter the number of student whose info you have to store:");
//		int studentcount = Sc.nextInt();
//		int count = 0;
//		while(count<=studentcount)
//		{
//		System.out.println("Enter First name of student");
//		String firstName = Sc.nextLine();
//		System.out.println("Enter Last name of student");
//		String lasstName = Sc.nextLine();
//		System.out.println("Enter Id of student");
//		int id = Sc.nextInt();
//		System.out.println("Enter the Mobile Number of Student:");
//	    long mobilenumber = Sc.nextLong();
//	    Sc.nextLine();
//	    System.out.println("Enter the City of Student");
//	    String city = Sc.nextLine();
//	   
//	    
//	   
//	    
//	    String info = eobj.getId()+": "+eobj.getFirstName()+": "+eobj.getLastName()+": "+eobj.getPhoneNumber()+": "+eobj.getCity();
//	    
//	    System.out.println("Enter File name :");
//	    String filename = Sc.nextLine();
//	    filename = filename+".txt";
//	    
//	    String directorypath = "C:\\Users\\Vozon\\Desktop\\FileHandling";
//	    File file = new File(directorypath+"\\"+filename);
//	    
//	    try {
//	    if(file.createNewFile())
//	    {
//	    	System.out.println("File is Created");
//	    }
//	    else
//	    {
//	    	System.out.println("File is already exist");
//	    }
//	    FileWriter writer = new FileWriter(file,true);
//	    writer.write(info+System.lineSeparator());
//	    	 writer.close();
//	    	 count++;
//	    }
//	    catch(Exception e)
//	    {
//	    	e.printStackTrace();
//	    }
//	}
	}
private String updateFile(Entity eobj) throws Exception
{
	System.out.println("Enter File name :");
    String filename = Sc.nextLine() + ".txt";
    ;
    
    String directorypath = "C:\\Users\\Vozon\\Desktop\\FileHandling";
    File file = new File(directorypath + "\\"+ filename);
    
    if(file.createNewFile())
    {
    	System.out.println("File is Created :"+filename);
    }
    else
    {
    	System.out.println("File is already Exists");
    }
    
    FileWriter writer = new FileWriter(file,true);
    String msg = eobj.getId()+": "+eobj.getFirstName()+": "+eobj.getLastName()+": "+eobj.getPhoneNumber()+": "+eobj.getCity();
    
    writer.write(msg+System.lineSeparator());
    writer.close();
    
	
	return msg;
}





private Entity getEntityObjectFromUser()
{
	System.out.println("Please Provide following details of Student:");
	System.out.println("Enter First name of student");
	String firstName = Sc.nextLine();
	
	System.out.println("Enter Last name of student");
	String lastName = Sc.nextLine();
	System.out.println("Enter Id of student");
	int id = Sc.nextInt();
	System.out.println("Enter the Mobile Number of Student:");
    long mobilenumber = Sc.nextLong();
    Sc.nextLine();
    System.out.println("Enter the City of Student");
    String city = Sc.nextLine();
    
    Entity eobj = constructorEntityObject(firstName,lastName,id,mobilenumber,city);
    return eobj;
    
}
private Entity constructorEntityObject(String firstName,String lastName,int id,long phoneNumber,String city)
{
	 Entity eobj = new Entity();
	    eobj.setId(id);
	    eobj.setCity(city);
	    eobj.setFirstName(firstName);
	    eobj.setLastName(lastName);
	    eobj.setPhoneNumber(phoneNumber);
	    return eobj;
}

}

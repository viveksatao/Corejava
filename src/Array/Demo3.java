package Array;

import java.util.*;

public class Demo3 
{
public static void main(String[] args) 
{
	Student S1 = new Student();
	S1.setId(101);
	S1.setName("Vivek Satao");
	S1.setCity("pune");
	
	Student S2 = new Student();
	S2.setId(102);
	S2.setName("Datta Satao");
	S2.setCity("hinjewadi");
	
	Student S3 = new Student();
	S3.setId(103);
	S3.setName("Tushar Satao");
	S3.setCity("akurdi");
	
	Student S4 = new Student();
	S4.setId(104);
	S4.setName("Amit Satao");
	S4.setCity("nandura");
	
    Student[] studentarray = {S1,S2,S3,S4}; 
    // Student Type Array , it only stores student class objects
    System.out.println();
    
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter city");
    String city = Sc.next().toLowerCase().trim();
	for(int i = 0;i<studentarray.length;i++)
	{
//		Student sobj = studentarray[i];
//		System.out.print(sobj.getId()+" ");
//		System.out.print(sobj.getName()+" ");
//		System.out.print(sobj.getCity()+" ");
		
//		ORRRRRRRRRRRRRRRRRRRRRRR
		
//		System.out.print(studentarray[i].getId()+" ");
//		System.out.print(studentarray[i].getName()+" ");
//		System.out.print(studentarray[i].getCity()+" ");
		if(studentarray[i].getCity().equals(city))
		{
			System.out.println(studentarray[i].getName());
		}
		System.out.println();
	}
   
    
}
}

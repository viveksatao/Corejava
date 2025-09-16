package arrayassignmentpart3;
import java.util.*;

import arrayassignmentpart3.*;
public class Service 
{
	public static void Serive() 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number of Student whose details you have to store :");
		int size = Sc.nextInt();
		Student[] sobj = new Student [size];

		int i = 0;
		while(i<size)
		{
			sobj[i] = new Student();
			System.out.println("Enter details of student " + (i+1));
			 System.out.print("Enter Id: ");
	            int id = Sc.nextInt();
	            Sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = Sc.nextLine();
	            System.out.println("Enter Marks:");
	            int marks = Sc.nextInt();
	            
	            sobj[i].setid(id);
	            sobj[i].setName(name);
	            sobj[i].setMarks(marks);  
	            i++;
		}
        while(true)
        {
        	System.out.println("Enter 1 to  Find and print the student with highest marks");
    		System.out.println("Enter 2 to  Print names of students who scored more than 75");
            System.out.println("Enter 3 to  Count how many students passed (marks >= 40).");
            System.out.println("Enter 4 to  Sort the array of Student objects based on marks");
            System.out.println("Enter 5 to  Print name of the topper");
            System.out.println("Enter 6 to  Print all students whose name starts with 'A");
            System.out.println("Enter 7 to  Print the average marks of all students");
            System.out.println("Enter 8 to get Details of All Students :");
            System.out.println("Enter 9 to Exit");
            System.out.println();
            Sc.nextLine();
            int n  = Sc.nextInt();
		switch(n)
		{
		case 1 :
		{
			int maxmarks = Integer.MIN_VALUE;
			Student obj = new Student();
			for(int j = 0;j<sobj.length;j++)
			{
				
				if(sobj[j].getMarks()>maxmarks)
				{
					maxmarks = sobj[j].getMarks();
					obj = sobj[j];
					
				}
			}
			System.err.println("student with highest marks:");
			System.err.println(obj);
			break;
		}
		case 2 :
		{
			System.out.println("Names of students who scored more than 75:");
			for(int j = 0;j<sobj.length;j++)
			{
				if(sobj[j].getMarks()>75)
				{
					System.err.println(sobj[j].getName());
				}
			}
			break;
		}
		case 3 :
		{
			int count = 0;
			for(int j = 0;j<sobj.length;j++)
			{
				if(sobj[j].getMarks()>=40)
				{
					count++;
				}
			}
			System.err.println(count+" Students has been passed (marks >= 40)");
			break;
		}
		case 4 :
		{
			for(int j = 0;j<sobj.length;j++)
			{
			for(int k = 0;k<sobj.length-1-j;k++)
			{
				if(sobj[k].getMarks() >sobj[k+1].getMarks())
				{
					Student temp = sobj[k];
					sobj[k] = sobj[k+1];
					sobj[k+1]= temp;	
				}
			}
			}
			 
			System.err.println("After Sorting based on marks:");
			System.err.println(Arrays.toString(sobj));
			break;
		}
		case 5 :
		{
			int maxmarks = Integer.MIN_VALUE;
			Student obj = new Student();
			for(int j = 0;j<sobj.length;j++)
			{
				
				if(sobj[j].getMarks()>maxmarks)
				{
					maxmarks = sobj[j].getMarks();
					obj = sobj[j];
					
				}
			}
			System.err.println("Name of Topper is :");
			System.err.println(obj.getName());
			break;
		}
		case 6 :
		{
			System.out.println("Name of Students Start with 'A' are/is : ");
			for(int j = 0;j<sobj.length;j++)
			{
				
				if(sobj[j].getName().charAt(0)=='A')
				{
					System.err.println(sobj[j].getName());
				}
			}
			break;
		}
		case 7 :
		{
			int total = 0;
			for(int j = 0;j<sobj.length;j++)
			{
				total=sobj[j].getMarks()+total;
			}
			System.err.println("Average marks of all student is :"+(total/sobj.length));
			break;
		}
		case 8:
		{
			System.out.println("Details of All Student is :");
			{
				for(Student s : sobj)
				{
					System.err.println(s);
				}
			}
			break;
		}
		 case 9: 
		 {
	            System.err.println("Exiting program...");
	            System.err.println("ThankYou..................");
	            return;    
	     }
		default : 
		{
			System.out.println("Invalid Input");
		}
		
        }
		}
	

	}
}

package com.in.irise;

import java.util.*;

class DB
{
	String name ;
	int maths;
	int physics;
	int chem;
	float avg;
	public DB(String name , int maths , int physics , int chem )
	{
		this.name = name;
		this.maths = maths;
		this.chem = chem;
		this.physics = physics;
		
	}
}

public class StudentInfoSystem {
    public static void main(String[] args) throws Exception
    {
        Scanner Sc = new Scanner(System.in);

        int maths = -1;
        int physics = -1;
        int chem = -1;
        String name = "";
        
        while (true) {
            System.out.println("\n---------------- Menu ----------------");
            System.out.println("Enter 1 to Enter Name and Your Marks");
            System.out.println("Enter 2 to Calculate Average of your Marks");
            System.out.println("Enter 3 to Exit the System");
            System.out.print("Enter your choice: ");
            int choice = Sc.nextInt();

            switch (choice) {
                case 1:
                	 Sc.nextLine();
                    System.out.print("Enter Name of Student: ");
                    name = Sc.nextLine();
                    
                    
                    System.out.print("Enter marks obtained in Maths (0-100): ");
                    maths = Sc.nextInt();
                    if (maths < 0 || maths > 100) {
                        System.out.println("Marks should be between 0 and 100.");
                        break;
                    }

                    System.out.print("Enter marks obtained in Physics (0-100): ");
                    physics = Sc.nextInt();
                    if (physics < 0 || physics > 100) {
                        System.out.println("Marks should be between 0 and 100.");
                        break;
                    }

                    System.out.print("Enter marks obtained in Chemistry (0-100): ");
                    chem = Sc.nextInt();
                    if (chem < 0 || chem > 100) {
                        System.out.println("Marks should be between 0 and 100.");
                        break;
                    }

                    System.out.println("Student data recorded successfully.");
                    

                case 2:
                    if (maths == -1 || physics == -1 || chem == -1) {
                        System.out.println("Please enter marks before calculating average.");
                    } else {
                        float avg = (float)(maths + physics + chem) / 3;
                        System.out.println("Student Name: " + name);
                        System.out.println("Average Marks: " + avg);
                    }
                    DB dobj = new DB(name,maths,physics,chem);
                    
                    break;

                case 3:
                    System.out.println("Student Information System is Successfully Exited");
                    System.out.println("Thank you!");
                    Sc.close();
                    return;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }
    }
}

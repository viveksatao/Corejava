package com.listsetassignment;
import java.util.*;

public class Program7 {

	public static void main(String[] args) 
	{
		
	Scanner Sc = new Scanner(System.in);
	 List<String> list = new ArrayList<>();	
	 System.out.println("Enter the List Elements");
	 for(int i = 0;i<5;i++)
	 {
		 list.add(Sc.next());
	 }
	 
	 for(String s : list)
	 {
		 String temp = s;
		 if(temp.equals(s.toUpperCase()))
		 {
			 System.out.println(s);
		 }
	 }
	 Sc.close();

	}

}

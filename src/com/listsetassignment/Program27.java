package com.listsetassignment;

import java.util.*;
public class Program27 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Full name of User");
        List<String> list = new ArrayList<>();
        for(int i = 0;i<2;i++)
        {
        	list.add(Sc.nextLine().toLowerCase());
        }
        
        for(String s : list)
        {
        	String firstname = s.split(" ")[0];
        	System.out.println(firstname);
        }
        
        	
        
        
	}

}

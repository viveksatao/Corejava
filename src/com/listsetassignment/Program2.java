package com.listsetassignment;

import java.util.*;
public class Program2 {

	public static void main(String[] args) 
	{
		List <String> list = Arrays.asList("Amit","Ashish","Vivek","Datta");
		
		for(String s : list)
		{
			if(s.startsWith("A"))
			{
				System.out.print(s+" ");
			}
		}
				
	}
}

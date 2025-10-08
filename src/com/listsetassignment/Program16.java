package com.listsetassignment;

import java.util.*;
public class Program16 {

	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		Set<Integer> set = new LinkedHashSet<>();
		System.out.println("Enter Elements :");
		for(int i = 0;i<10;i++)
		{
			set.add(Sc.nextInt());
		}
		
		boolean found = false;
		
		System.out.println("Enter Number which you have to find:");
		int num  = Sc.nextInt();
		
		for(int n : set)
		{
		  if(n==num)
		  {
			  found = true;
		  }
		}
		System.out.println(found);

	}

}

package com.listsetassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Program23 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the elements in the List 1:");
		Scanner Sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		for(int i = 0;i<5;i++)
		{
			list.add(Sc.next().toLowerCase());
		}
		System.out.println("Enter the elements in the List 2:");
		List<String> list1 = new ArrayList<>();
		for(int i = 0;i<5;i++)
		{
			list1.add(Sc.next().toLowerCase());
		}
		Set<String> set = new HashSet<>(list.size());
		
		for(String s : list)
		{
			if(list1.contains(s))
			{
				set.add(s);
			}
		}
		System.out.println(set);
		

	}

}

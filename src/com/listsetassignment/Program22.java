package com.listsetassignment;

import java.util.*;
public class Program22 {

	public static void main(String[] args) 
	{
		System.out.println("ENter the elements in the List:");
		Scanner Sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		for(int i = 0;i<5;i++)
		{
			list.add(Sc.next().toLowerCase());
		}
		ArrayList<String> uniqueList = new ArrayList<>(list.size());
		
		for(String s : list)
		{
			if(!uniqueList.contains(s))
			{
				uniqueList.add(s);
			}
		}
		System.out.println(uniqueList);

	}

}

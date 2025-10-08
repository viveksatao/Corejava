package com.listsetassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Program24 {

	public static void main(String[] args) {
		System.out.println("Enter the elements in the List :");
		Scanner Sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		for(int i = 0;i<5;i++)
		{
			list.add(Sc.next().toLowerCase());
		}
		System.out.println("Enter the elements in the Set:");
		Set <String> set = new LinkedHashSet<>();
		for(int i = 0;i<5;i++)
		{
			set.add(Sc.next().toLowerCase());
		}
		
		for(String s : list)
		{
			if(!set.contains(s))
			{
				System.out.println(s); 
			}
		}
	}
}

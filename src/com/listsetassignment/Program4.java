package com.listsetassignment;

import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the elements in List");
		for(int i = 0;i<5;i++)
		{
			list.add(Sc.next());
		}
		
		int count = 0;
		
		for(String s : list)
		{
			if(s.length()>5)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}

package com.listsetassignment;

import java.util.*;
public class Program17 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		Set<String> set = new HashSet<>();
        for(int i = 0;i<2;i++)
        {
        	set.add(Sc.next());
        }
        int count = 0;
        for(String s : set)
        {
        	s = s.toLowerCase();
        	char ch [] = s.toCharArray();
        	for(char c : ch)
        	{
        		if(c == 'a' || c=='e' || c=='o' || c=='i' || c =='u')
        		{
        			count++;
        		}	
        	}
        }
        System.out.println(count);
	}

}

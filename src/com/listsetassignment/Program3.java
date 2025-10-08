package com.listsetassignment;
import java.util.*;

public class Program3 {
	
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = 0;
		
		for(int a : list)
		{
			if(a%2==0)
			{
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}

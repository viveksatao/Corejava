package com.listsetassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int a : list)
		{
			if(a>max)
			max = a;
			
		}
		
		for(int a : list)
		{
			if(a<min)
			{
				min = a;
				
			}
		}
		System.out.println("Maximum value : "+max);
		System.out.println("Minimum Value :"+min);

	}

}

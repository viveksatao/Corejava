package com.listsetassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(1,2,3,4,5,6,7,8,30,15);
		
		int count = 0;
		
		for(int i : list)
		{
			if(i%3==0 && i%5==0)
			{
				count++;
			}
		}
		System.out.println("Number of Elements divisible by 3 and 5 are :"+count);

	}

}

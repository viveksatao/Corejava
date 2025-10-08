package com.listsetassignment;

import java.util.*;
public class Program11 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Elements:");
		for(int i = 0;i<10;i++)
		{
			set.add(Sc.nextInt());
		}
		System.out.println(set.size());

	}

}

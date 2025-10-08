package com.listsetassignment;

import java.util.*;

public class Program21 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(list);
		System.out.println(set);
		

	}

}

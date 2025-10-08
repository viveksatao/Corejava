package com.listsetassignment;

import java.util.*;


public class Program9 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
     List<Integer> list = new ArrayList<>();
     System.out.println("Enter the elements in list:");
     for(int i = 0;i<5;i++)
     {
    	 list.add(Sc.nextInt());
     }
     
     List<Integer> uniqueList = new ArrayList<>();
     
     for(int i : list)
     {
    	 if(!uniqueList.contains(i))
    	 {
    		 uniqueList.add(i);
    	 }
     }
     
     System.out.println("Unique Elements in the List : "+uniqueList);
     
	}

}

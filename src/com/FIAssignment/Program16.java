package com.FIAssignment;

import java.util.function.*;
public class Program16 {

	public static void main(String[] args) 
	{
		BiFunction<Integer, Integer, Integer> add = (x,y)->x+y;
		
		System.out.println(add.apply(5,10));
	}
}

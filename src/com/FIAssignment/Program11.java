package com.FIAssignment;

import java.util.function.*;

public class Program11 {

	public static void main(String[] args) 
	{
	Supplier<Integer> num1 = ()->10;
	
	Supplier<Integer> num2 = ()->20;
	
	Function<Integer,Integer> function = (x)->x*2;
	
	System.out.println("Final Sum is : " +(function.apply(num1.get())+function.apply(num2.get())));
	

	}

}

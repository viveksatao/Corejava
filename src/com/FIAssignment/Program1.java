package com.FIAssignment;

import java.util.function.*;
public class Program1 {

	public static void main(String[] args) 
	{
		Supplier<Integer> supplier = ()->20;
		
		Predicate<Integer> predicate = (x)->x>0;
		
		Consumer<Integer> consumer = (x)->System.out.println(x+" is Postive Number");
		
		boolean result =  predicate.test(supplier.get());
		
		if(result)
		{
			consumer.accept(supplier.get());
		}

	}

}

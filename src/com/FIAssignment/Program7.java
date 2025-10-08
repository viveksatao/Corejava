package com.FIAssignment;

import java.util.function.*;
public class Program7 {

	public static void main(String[] args) 
	{
	
		Predicate<Integer> predicate = x->x%2!=0;
		
		Function<Integer,Integer> function = x->x*x;
		
		Consumer<Integer> consumer = (x)->System.out.println("Sqaure is : "+x);
		
		Supplier<Integer> supplier = ()->19;
		
		if(predicate.test(supplier.get()))
		{
			consumer.accept(function.apply(supplier.get()));
		}
		else
		{
			System.out.println("Given Number is not ODD");
		}

	}

}

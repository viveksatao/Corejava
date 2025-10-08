package com.FIAssignment;

import java.util.function.*;
public class Program5 {

	public static void main(String[] args) 
	{
		Predicate<String> predicate = x->x.startsWith("A");
		
		Supplier<String> supplier = ()->"Amit";
		
		Consumer<String> consumer = x->System.out.println(x+" Name Accepted...");
		
		if(predicate.test(supplier.get()))
		{
			consumer.accept(supplier.get());
		}
		else
		{
			System.out.println("Not Accepted...");
		}

	}

}

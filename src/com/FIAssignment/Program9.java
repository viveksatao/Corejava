package com.FIAssignment;

import java.util.function.*;
public class Program9 {

	public static void main(String[] args) 
	{
		Function<String , String> function = (x)->x.toUpperCase();
		
		Consumer<String> consumer = x->System.out.println("After using Uppercase Method :"+x);
		
		Supplier<String> supplier = ()->"Vivek";
		
		consumer.accept(function.apply(supplier.get()));
		
		

	}

}

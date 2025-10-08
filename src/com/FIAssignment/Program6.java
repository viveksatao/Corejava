package com.FIAssignment;

import java.util.function.*;
public class Program6 {

	public static void main(String[] args) 
	{
		Function<Integer,Integer> function = (x)->x*x*x;
		
		Consumer<Integer> consumer = (x)->System.out.println("cube is : "+x);
		
		Supplier<Integer> supplier = ()->10;
		
		consumer.accept(function.apply(supplier.get()));
		

	}

}

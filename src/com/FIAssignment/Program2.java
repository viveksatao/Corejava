package com.FIAssignment;

import java.util.function.*;
public class Program2 {
	public static void main(String[] args) 
	{
		Function<String,Integer> function = x->x.length();
		
		Supplier<String> supplier = ()->"Vivek";
		
		Consumer<Integer> consumer  = (x)->System.out.println("Length of Given String is :"+x);
		
		consumer.accept(function.apply(supplier.get()));
	}

}

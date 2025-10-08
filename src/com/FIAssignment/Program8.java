package com.FIAssignment;

import java.util.function.*;
public class Program8 {

	public static void main(String[] args) 
	{
		Predicate<String> predicate = x->x.length()>=8;
		
		Consumer<String> consumer = x->System.out.println(x+" is Strong Password");
		
		Supplier<String> supplier = ()->"VivekSatao@165";
		
		if(predicate.test(supplier.get()))
		consumer.accept(supplier.get());
	}

}

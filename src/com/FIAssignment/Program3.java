package com.FIAssignment;

import java.util.function.*;
public class Program3 {
	public static void main(String[] args) 
	{
		Function<Double,Double> function = (x)->x*0.90;
		
		Supplier<Double> supplier = ()->1000.0d;
		
		Predicate<Double> predicate = x->x>=1000.0d;
		
		Consumer<Double> consumer = x->System.out.println("FInal Price is :"+x+" Rs.only");
		
		if(predicate.test(supplier.get()))
		{
			consumer.accept(function.apply(supplier.get()));
		}
		
		
	}

}

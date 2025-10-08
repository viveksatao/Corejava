package com.FIAssignment;

import java.util.function.*;
public class Program4 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = x->x>=18;
		
		Supplier<Integer> supplier = ()->20;
		
		System.out.println(predicate.test(supplier.get()));
	}

}

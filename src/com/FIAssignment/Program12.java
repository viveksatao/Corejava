package com.FIAssignment;

import java.util.function.*;
import java.util.*;

public class Program12 {

	public static void main(String[] args) 
	{
		Supplier<List<Integer>> supplier = ()->
		{
			return Arrays.asList(1,2,3,4,5,6,7,8,9);
		};
		
		Consumer<List<Integer>> consumer = (x)->
		{
			for(int n : x)
			{
				System.out.print(n+" ");
			}
		};
		
		consumer.accept(supplier.get());

	}

}

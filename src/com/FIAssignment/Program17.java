package com.FIAssignment;

import java.util.function.*;

public class Program17 {

	public static void main(String[] args) 
	{
		BiFunction<String, Integer, String> repeats = (x,y)->
		{
			
			for(int i = 0;i<y;i++)
			{
				System.out.print(x);
			}
			return "";
		};

		Supplier<String> str = ()->"Hi";
		Supplier<Integer> num  = ()->3;
		
		repeats.apply(str.get(), num.get());
	}

}

package com.FIAssignment;

import java.util.function.*;
public class Program14 {

	public static void main(String[] args) 
	{
		Predicate <Integer> predicate3 = (x)->x%3==0; 
		
		Predicate <Integer> predicate5 = (x)->x%5==0;
		
		Predicate <Integer> predicate35 = (x)->(x%3==0) && (x%5==0);
		
		Function<Integer,String> function = (x)->
		{
			
			if(predicate3.test(x))
			{
				return "Fizz";
			}
			else if (predicate5.test(x))
			{
				return "Buzz";
			}
			else if(predicate35.test(x))
			{
				return "FizzBuzz";
			}
			return String.valueOf(x);
		};
		
		System.out.println(function.apply(30));
 
	}

}

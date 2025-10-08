package PreDefinedFunctionalInterface;

import java.util.*;
import java.util.function.Function;
public class Test2 {
	
	public static void main(String[] args) 
	{
		
		Function <Integer,Integer> sq = x -> x*x;
		System.out.println(sq.apply(5));
		  
		         //InputYpe ReturnType
		Function <String ,   Integer>   count = (String Str) ->
		{
			return Str.length();
		};
		System.out.println("Number of Characters in the String is : "+count.apply("Vivek"));
		
		Function <Integer,Integer> addTwo = (x)->
		{
			return x+2;
		};
		Function <Integer,Integer> addThree = (x)->
		{
			return x+3;
		};
		
//		System.out.println(addThree.apply(addTwo.apply(5)));
		
		System.out.println(addTwo.andThen(sq).apply(5));
	
	}

}

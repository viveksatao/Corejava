package com.FIAssignment;

import java.util.function.*;

public class Program13 {

	public static void main(String[] args) 
	{
		Function<String,Boolean> function = (x)->
		{
			String temp = "";
			int j = 0;
			for(int i = x.length()-1;i>=0;i--)
			{
				temp = x.charAt(i)+temp;
				j++;
			}
			if(temp.equals(x))
			{
				return true;
			}
			return false;
			
	};
	
	
	Supplier<String> supplier = ()->"abba";
	
	System.out.println(function.apply(supplier.get()));
	
	}

}

package com.FIAssignment;

import java.util.function.*;
public class Program15 {

	public static void main(String[] args) 
	{
		 
		Supplier<String> supplier = ()->"adminvivek";
		
		Predicate<String> predicate = (x)->
		{
			if(x.startsWith("admin"))
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		if(predicate.test(supplier.get())==true)
		{
			System.out.println("Access Granted");
		}
		else
		{
			System.out.println("Access Denied");
		}
			
		

	}

}

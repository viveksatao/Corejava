package PreDefinedFunctionalInterface;

import java.util.*;
import java.util.function.*;
public class Test3 {
	
	public static void main(String[] args) {
		
		
		
		Consumer<String> c = Str->System.out.println(Str.toLowerCase());
		
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Consumer<List<Integer>> ca = (x)->
		{
			for(int n : x)
			{
				System.out.print(n+" ");
			}
		};
		ca.accept(list);
		
		
		
		
		
		c.accept("Amit");
	}

}

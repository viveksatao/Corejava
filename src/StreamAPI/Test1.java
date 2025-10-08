package StreamAPI;

import java.util.*;

public class Test1 {

	public static void main(String[] args) 
	{
		List<Integer> l = Arrays.asList(12,1,32,4,77,6,4,33,678,4,90);
		            // foreach is ternery Operator and we can write only one terminal operator in one API
		l.stream().forEach(x->System.out.print(x+" "));
		System.out.println();
		
		long count  = l.stream()
		.filter(x->x%3==0)
		.filter(x->x%2==0)
		.map(x->x*10)
		.count();
		System.out.println(count);
		
		         l.stream()
				.filter(x->x%3==0)
				.filter(x->x%2==0)
				.map(x->x*10)
				.forEach(x->System.err.println(x+" "));
				
		
		

	}

}

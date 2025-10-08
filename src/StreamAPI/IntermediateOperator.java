package StreamAPI;

import java.util.*;
import java.util.stream.*;
public class IntermediateOperator {

	public static void main(String[] args) 
	{
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// Find Number divisible by 3 and print it 
		
		l.stream().filter(x->x%3==0).forEach(x->System.out.print(x+" "));
		
		// Multiply each number by 10 and store it in list
		
		System.out.println();
		List<Integer> list = l.stream().map(x->x*10).collect(Collectors.toList());
		System.out.println(list);

		// Count numbers less than 5
		System.out.println(l.stream().filter(x->x<5).count());
	}

}

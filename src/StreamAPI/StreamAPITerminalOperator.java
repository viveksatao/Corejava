package StreamAPI;


import java.util.stream.*;
import java.util.*;

public class StreamAPITerminalOperator {

	public static void main(String[] args) 
	{
		List<Integer> l = Arrays.asList(12,1,32,4,77,6,4,33,678,4,90);
		
		// 1. Print using for each
		l.stream().forEach(x->System.out.print(x+" "));
		System.out.println();
		
		// 2. skipping element and storing in list
		List<Integer> list = l.stream().skip(3).toList();
		System.out.println(list.toString());
		
		// 3. count
		long count  = l.stream().count();
		System.out.println("Number of elemnts in the list: "+count);
		
		// 4. collect

	     Set<Integer> s = l.stream().collect(Collectors.toSet());
	     System.out.println(s);
	     
	  // 5 . Any match
	     System.out.println(l.stream().anyMatch(x->x>100));
	     
	  // 6. All match
	     System.out.println(l.stream().allMatch(x->x>10));
	     
	     ////7. None match
	     System.out.println(l.stream().noneMatch(w -> w == 32));
		
	}

}

package PreDefinedFunctionalInterface;

import java.util.*;
import java.util.function.Predicate;
public class Test1 {

	public static void main(String[] args) {
	
		Predicate<Integer> p = a->a%2==0;
		System.out.println(p.test(20));
		
		
		Predicate<String> b = str->str.charAt(0)=='A';
		System.out.println(b.test("Amit"));

	}

}

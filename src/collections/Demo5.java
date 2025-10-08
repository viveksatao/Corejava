package collections;
import java.util.*;

public class Demo5 {

	public static void main(String[] args) {
		
		//KeY points about HAshSet
		// It does NOT allows Duplicate elements
		// Allows ONLY ONE Null element
		// Insertion order is NOT  preserved
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(15);
		set.add(null);
		set.add(12);
		set.add(null);
		
		System.out.println(set.toString());
		
		
		
		//KeY points about LinkedHshSet
				// It does NOT allows Duplicate elements
				// Allows ONLY ONE Null element
				// Insertion order is preserved
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(12);
		set1.add(15);
		set1.add(null);
		set1.add(12);
		set1.add(null);
		
		System.out.println(set1.toString());
		
		
		
		//KeY points about TreeSet
		// It does NOT allows Duplicate elements
		// It does NOT Allows  Null element
		// Insertion order is NOT preserved
		// It Sort the elements in ascending order
		Set<Integer> set2 = new TreeSet<>();
		set2.add(12);
		set2.add(15);
//		set2.add(null); Not allow
		set2.add(12);
		set2.add(13);
//		set2.add(null); not allow
		
		System.out.println(set2.toString());
			
		
	}

}

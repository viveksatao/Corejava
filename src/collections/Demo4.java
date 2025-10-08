package collections;
import java.util.*;


public class Demo4 {
public static void main(String[] args) 
{
	
	
	//Key Points of List
	// Duplicate elements allows
	// Allows Null elements
	// Insertion order is preserved
	
	List<Integer> list = new ArrayList<>();
	list.add(12);
	list.add(15);
	list.add(12);
	list.add(null);
	list.add(null);
	System.out.println(list.toString());
	
	List<Integer> list1 = new LinkedList<>();
	list1.add(12);
	list1.add(15);
	list1.add(12);
	list1.add(null);
	list1.add(null);
	
	System.out.println(list1.toString());
}

}

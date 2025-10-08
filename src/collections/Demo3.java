package collections;
import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		
		//Index based Searching is Fast
		//Adding Elements is Fast
		//Adding Element in Between Existing elements is slow operation
        // Deletion Operation is slow or costly
		
		list.add(11);
		list.add(21);
		list.add(31);
		list.add(41);
		list.add(51);
		
		for(int i : list)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(list.indexOf(31));
		
		//if we have array of fixed size and we have to add more elements in it so we can convert the existing array into arraylist are as follows 
		
		Integer [] arr = {101,121,131,141,151};
		List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
		list1.add(1);
		System.out.println(list1);
		
		
	}

}

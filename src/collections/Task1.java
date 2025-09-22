package collections;
import java.util.*;
public class Task1 {

//	1. Write a Java program to create an empty ArrayList of Strings and print it.
//	2. Add the following names to an ArrayList: "Ram", "Sham", "Sita". Then print the ArrayList.
//	3. Write a program to insert an element at the first position of an ArrayList.
//	4. Write a program to get the element at index 2 from an ArrayList.
//	5. Write a program to change the element at index 1 in an ArrayList.
//	6. Write a program to remove the element at index 0 from an ArrayList.
//	7. Write a program to find the size of an ArrayList after adding 5 elements.
//	8. Write a program to check whether an element exists in an ArrayList or not. (Example: check if "Sita" is present).
//	9. Write a program to iterate over an ArrayList using for loop and print all elements.
//	10. Write a program to clear all elements from an ArrayList and check if it is empty.

	public static void main(String[] args) {
//		1. Write a Java program to create an empty ArrayList of Strings and print it.
		List<String> list = new ArrayList<>();
		System.out.println(list.toString());
//		2. Add the following names to an ArrayList: "Ram", "Sham", "Sita". Then print the ArrayList.
		list.add("Ram");
		list.add("Shyam");
		list.add("Sita");
		System.out.println(list.toString());
		
//		3. Write a program to insert an element at the first position of an ArrayList.
		list.set(0,"Vivek");
		
//		4. Write a program to get the element at index 2 from an ArrayList.
		System.out.println("Element present at index no. 2 is :");
		System.out.println(list.get(2));

//		5. Write a program to change the element at index 1 in an ArrayList.
		list.set(0,"Datta");

//6. Write a program to remove the element at index 0 from an ArrayList.
		list.remove(0);
//		7. Write a program to find the size of an ArrayList after adding 5 elements.
		list.add("Nakul");
		list.add("Amit");
		list.add("Tushar");
		System.out.println("Size of list is :"+list.size());
		
//		8. Write a program to check whether an element exists in an ArrayList or not. (Example: check if "Sita" is present).
		System.out.println("Sita is present or not");
		System.out.println(list.contains("sita"));
		
//		9. Write a program to iterate over an ArrayList using for loop and print all elements.
		System.out.println("After iterating over List");
		for(String s : list)
		{
			System.out.println(s);
		}
      
//		10. Write a program to clear all elements from an ArrayList and check if it is empty.
		System.out.println("ArrayList is empty or not ");
		System.out.println(list.isEmpty());
		list.clear();
	}

}

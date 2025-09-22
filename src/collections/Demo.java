package collections;
import java.util.*;

public class Demo {

public static void main(String[] args) 
{
	List<String> list = new ArrayList<String>();
	list.add("Vivek");
	list.add("Satao");
	list.add("Datta");
	int i = 0;
	for(String s : list)
	{
		list.set(i, s.toUpperCase());
		i++;
	}
	System.out.println(list.toString());
	
	//<> is known as diamond braces -> generics-> it deternmines which type of object we have to store
	
	//without generics
	
	List lobj = new ArrayList();
	lobj.add(123);
	lobj.add(23.232);
	lobj.add("DattaBhau");
	lobj.add(false);
	
	
}

}

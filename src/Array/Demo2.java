package Array;
import java.util.*;

public class Demo2 
{
public static void main(String[] args) 
{
  //Parent class of all classes is object class
 //Every class is derived from object class

	//Heterogenous Array
	Object[] heteroarray = {12,"Hello",7.45,false,'a'};
//    System.out.println(Arrays.toString(heteroarray));
    
    for(Object obj : heteroarray)
    {
    	System.out.print(obj+" ");
    }
    for(int i = heteroarray.length-1;i>=0   ;i--)
    {
    	System.out.print(heteroarray[i]+" ");
    }
    
}
}

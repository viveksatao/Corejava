package arrayassignment;

import java.util.*;


public class Program27 {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("enter the size of an Array 1:");
	int size1 = Sc.nextInt();
	int Arr1[] = new int[size1];
	
	System.out.println("Enter the  elemnts in array1:");
	for(int i = 0;i<size1;i++)
	{
		Arr1[i] = Sc.nextInt();
	}
	
	System.out.println(Arrays.toString(Arr1));
	if(Arr1.length!=0)
	{
	System.out.println(isSorted(Arr1));
	}
	
}
public static boolean isSorted(int [] arr)
{
  
  
   for(int i = 0;i<arr.length-1;i++)
   {
	   
	   if(arr[i]>=arr[i+1])
	   {
		   return false;
	   }
	  
   }
   return true;
    
	
}

}

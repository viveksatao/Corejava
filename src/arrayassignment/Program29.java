package arrayassignment;

import java.util.*;


public class Program29 {
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
	System.out.println(Arrays.toString(elementReplace(Arr1)));
	}
	
}
public static int[] elementReplace(int [] arr)
{
  
  
   int temp[] = new int[arr.length];
   int mul = 1;
   for(int i = 0;i<arr.length;i++)
   {
	   for(int j = 0;j<arr.length;j++)
	   {
		 if(i!=j)
		 {
			 mul = mul*arr[j];
		 }
	   }
	   temp[i] = mul;
	   mul = 1;
   }
   return temp;
    
	
}

}

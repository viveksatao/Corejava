package arrayassignment;

import java.util.*;


public class Program33 {
public static void main(String[] args) 
{
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
     int result[][] = SeperateEvenOdd(Arr1);
     for(int[] a : result)
     {
    	 System.out.println(Arrays.toString(a));
     }
	}
	
}
public static int[][]  SeperateEvenOdd(int [] arr)
{
	 int evenCount = 0, oddCount = 0;
	    for (int num : arr) 
	    {
	        if (num % 2 == 0)
	            evenCount++;
	        else
	            oddCount++;
	    }
  int even[] = new int[evenCount];
  int odd[] = new int[oddCount];
  int index1 = 0;
  int index2 = 0;
  for(int num : arr)
  {
	  if(num%2==0)
	  {
		  even[index1++] = num;
	  }
	  else
	  {
		  odd[index2++] = num;
	  }
  }
  
   return new int[][] {even , odd};
	
}

}

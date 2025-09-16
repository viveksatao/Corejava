package arrayassignment;

import java.util.*;


public class Program20 {
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
		
		int result[] = frequency(Arr1);
		for(int i = 0;i<result.length;i++)
		{
			if(result[i]!=0)
			{
				System.out.println(i+" :"+result[i]);
			}
		}
	}
}
public static int[] frequency(int [] arr)
{
    int max = Integer.MIN_VALUE;
    for(int num:arr)
    {
    	if(max<num)
    	{
    		max = num;
    	}
    }
    int count[] = new int[max+1];
    for(int i = 0;i<arr.length;i++)
    {
    	count[arr[i]]++;
    }
    return count;
    
	
}

}

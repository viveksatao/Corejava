package arrayassignment;

import java.util.*;


public class Program15 {
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
		
		System.out.println(Arrays.toString(sortAsc(Arr1)));
	}
}
public static int[] sortAsc(int [] arr)
{
	
	for(int i = 0;i<arr.length;i++)
	{
		for(int j = i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	return arr;
}

}

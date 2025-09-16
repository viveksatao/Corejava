package arrayassignment;

import java.util.*;


public class Program16 {
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
		
		System.out.println(Arrays.toString(sortDesc(Arr1)));
	}
}
public static int[] sortDesc(int [] arr)
{
	
	for(int i = 0;i<arr.length-1;i++)
	{
		for(int j = 0;j<arr.length-i-1;j++)
		{
			if(arr[j]<arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	return arr;
}

}

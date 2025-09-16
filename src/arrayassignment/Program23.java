package arrayassignment;

import java.util.*;


public class Program23 {
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
	System.out.println("enter the size of an Array 2:");
	int size2 = Sc.nextInt();
	int Arr2[] = new int[size2];
	
	System.out.println("Enter the  elemnts in array2:");
	for(int i = 0;i<size2;i++)
	{
		Arr2[i] = Sc.nextInt();
	}
	
	
	System.out.println(Arrays.toString(Arr1));
	if(Arr1.length!=0 && Arr2.length!=0)
	{
	System.out.println(Arrays.toString(findCommonElements(Arr1,Arr2)));
	}
}
public static int[] findCommonElements(int [] arr , int [] brr)
{
	
	ArrayList<Integer> list = new ArrayList<>(Math.min(arr.length, brr.length));
   

	for(int i = 0;i<arr.length;i++)
	{
		for(int j = 0;j<brr.length;j++)
		{
			if(arr[i]==brr[j])
			{
				list.add(arr[i]);
			}
		}
	}
	int temp[] = new int [list.size()];
	for(int i = 0;i<list.size();i++)
	{
		temp[i] = list.get(i);
	}
	
	return temp;
}

}

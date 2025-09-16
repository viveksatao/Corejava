package arrayassignment;

import java.util.*;
import java.util.Scanner;

public class Program14 {

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
	int result[] = RemoveDuplicates(Arr1);
	System.out.println(Arrays.toString(result));
}
public static int[] RemoveDuplicates(int Arr[])
{

		int[] temp = new int[Arr.length];
		int j = 0;
		for(int i = 0;i<Arr.length;i++)
		{
			boolean found = false;
			for(int k = 0;k<j;k++)
			{
				if(Arr[i]==Arr[k])
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				temp[j] = Arr[i];
				j++;
			}
			
		}
		
	
	return Arrays.copyOf(temp,j);
	
}
}

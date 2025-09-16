package arrayassignment;

import java.util.*;


public class Program34 {
public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("enter the size of an Array 1:");
	int size1 = Sc.nextInt();
	String Arr1[] = new String[size1];
	System.out.println("Enter the  elemnts in array1:");
	for(int i = 0;i<size1;i++)
	{
		Arr1[i] = Sc.next();
	}
	System.out.println(Arrays.toString(Arr1));
	if(Arr1.length!=0)
	{
     printVowelString(Arr1);
	}
	
}
public static void  printVowelString(String [] arr)
{
	for(int i = 0;i<arr.length;i++)
	{
		if(arr[i].charAt(0)=='a' || arr[i].charAt(0)=='e'|| arr[i].charAt(0)=='i' || arr[i].charAt(0)=='o' || arr[i].charAt(0)=='u' || arr[i].charAt(0)=='A' || arr[i].charAt(0)=='E'|| arr[i].charAt(0)=='I' || arr[i].charAt(0)=='O' || arr[i].charAt(0)=='U')
		{
			System.out.println(arr[i]);
		}
	}
}

}

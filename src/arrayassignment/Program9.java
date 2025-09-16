package arrayassignment;
import java.util.*;

public class Program9 {

public static void main(String[] args) 
{
	Scanner Sc = new Scanner(System.in);
	System.out.println("enter the size of an Array:");
	int size = Sc.nextInt();
	int Arr[] = new int[size];
	System.out.println("Enter the array elemnts:");
	for(int i = 0;i<size;i++)
	{
		Arr[i] = Sc.nextInt();
	}
	System.out.println(Arrays.toString(Arr));
	int index = linearSearch(Arr, 10);
	if(index==-1)
	{
		System.out.println("Element is not present:");
		
	}
	else
	{
		System.out.println("Element is  present at :"+index+"th index");
	}
	
}
public static int  linearSearch(int [] arr , int n)
{
	

	
	if(arr.length==0)
	{
		return -1;
	}
	else 
	{

		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return i;
			}
		}
	}
	return -1;
}

}


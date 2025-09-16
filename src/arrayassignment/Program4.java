package arrayassignment;
import java.util.*;

public class Program4 {

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
	int min = minelement(Arr);
	System.out.println("Min element in an array is :"+min);
}
public static int minelement(int [] arr)
{
	int min =Integer.MAX_VALUE;
	if(arr.length==0)
	{
		return 0;
	}
	else 
	{

		for(int num : arr)
		{
			if(num<min)
			{
				min = num;
			}
		}
	}
	return min;
}

}

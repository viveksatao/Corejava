package arrayassignment;
import java.util.*;

public class Program7 {

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
	int oddeven[] = elementSum(Arr);
	System.out.println("Number of Odd element in an array is :"+oddeven[0]);
	System.out.println("Number of Even element in an array is :"+oddeven[1]);
}
public static int[] elementSum(int [] arr)
{
	
	int oddcount = 0;
	int evencount = 0;
	
	if(arr.length==0)
	{
		return new int[]{0,0};
	}
	else 
	{

		for(int num : arr)
		{
			if(num%2!=0)
			{
				oddcount++;
			}
			else
			{
				evencount++;
			}
		}
	}
	return new int[] {oddcount,evencount} ;
}

}

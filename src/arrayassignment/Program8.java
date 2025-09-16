package arrayassignment;
import java.util.*;

public class Program8 {

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
	System.out.println("Number of Positive element in an array is :"+oddeven[0]);
	System.out.println("Number of Negtive element in an array is :"+oddeven[1]);
}
public static int[] elementSum(int [] arr)
{
	
	int positivecount = 0;
	int negativecount = 0;
	
	if(arr.length==0)
	{
		return new int[]{0,0};
	}
	else 
	{

		for(int num : arr)
		{
			if(num>0)
			{
				positivecount++;
			}
			else
			{
				negativecount++;
			}
		}
	}
	return new int[] {positivecount,negativecount};
}

}

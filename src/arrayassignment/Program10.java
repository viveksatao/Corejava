package arrayassignment;
import java.util.*;

public class Program10 {

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
	
	printEvenIndices(Arr);
	
}
public static void  printEvenIndices(int [] arr)
{
	

	
	if(arr.length==0)
	{
		System.out.println("Enter size of array more than 0");
	}
	else 
	{
		for(int i = 0; i<arr.length;i=i+2)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

}



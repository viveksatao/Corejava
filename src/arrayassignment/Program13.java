package arrayassignment;
import java.util.*;

public class Program13 {

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
	System.out.println("enter the size of an Array 2:");
	int size2 = Sc.nextInt();
	int Arr2[] = new int[size2];
	System.out.println("Enter the  elemnts in array2:");
	for(int i = 0;i<size2;i++)
	{
		Arr2[i] = Sc.nextInt();
	}
	System.out.println(Arrays.toString(Arr2));
	 int Arr3[] = new int[size1+size2];
	 
	 for(int i = 0;i<size1;i++)
	 {
		 Arr3[i] = Arr1[i];
	 }
	 for(int i = 0;i<size2;i++)
	 {
		 Arr3[size1+i] = Arr2[i];
	 }
	 System.out.println(Arrays.toString(Arr3));

}


}

package Array;

import java.util.*;

public class Demo {

public static void main(String[] args)
	{
			int arr[] = {1,2,3,4,5,6,7};
			System.out.println(Arrays.toString(arr));
			System.out.println(arr.length);
			System.out.println(arr[6]);
			for(int n : arr)
			{
				System.out.print(n+" ");
			}
			Scanner Sc = new Scanner(System.in);
		    System.out.println();
			int Arr[] = new int[5];
			for(int i = 0;i<Arr.length;i++)
			{
				Arr[i] = Sc.nextInt();
			}
			System.out.println(Arrays.toString(Arr));
			System.out.println(Arr.hashCode());
			
			
			// //using part1 and part2
			// create a string,int, boolean and double arra
	}

}

package arrayassignment;

import java.util.*;


public class Program26 {
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
	
	
	System.out.println(Arrays.toString(Arr1));
	
	boolean alright = false;
	for(int i = 0;i<size1;i++)
	{
		if(Arr1[i]>=0 && Arr1[i]<100)
		{
			alright = true;
		}
		else
		{
			alright = false;
			System.err.println("Enter Marks Between 0 and 100 only");
			break;
		}
	}
	
	if(Arr1.length!=0 && alright)
	{
		char[] result = grade(Arr1);
		for(int i = 0;i<Arr1.length;i++)
		{
			System.out.println(Arr1[i]+":"+result[i]);
		}
	}
	
}
public static char[] grade(int [] arr)
{
    char ch [] = new char[arr.length];
    for(int i = 0;i<arr.length;i++)
    {
    	if(arr[i]>=90)
    	{
    		ch[i] = 'A';
    	}
    	else if(arr[i]>=80 && arr[i]<90)
    	{
    		ch[i] = 'B';
    	}
    	else if(arr[i]>=70 && arr[i]<80)
    	{
    		ch[i] = 'C';
    	}
    	else if(arr[i]>=60 && arr[i]<70)
    	{
    		ch[i] = 'D';
    	}
    	else if(arr[i]>=0 && arr[i]<60)
    	{
    		ch[i] = 'F';
    	}
    	else if(arr[i]>100)
    	{
    		ch[i] = '0';
    	}
    }
    return ch;
    
	
}

}

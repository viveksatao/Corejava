package LoopsFor;

public class Program6 {

	public static void main(String[] args) 
	{
		//5. Write a program to print all alphabets from a to z.
				System.out.println("Write a program to print all alphabets from a to z.");
				
				for(char ch='a';ch<='z';ch++)
				{
					System.out.print(ch+" ");
				}
				
				System.out.println();
				System.out.println(" Write a program to print reverse alphabets from Z to A");
				// Write a program to print reverse alphabets from Z to A
				for(char ch='Z';ch>='A';ch--)
				{
					System.out.print(ch+" ");
				}
	}

}

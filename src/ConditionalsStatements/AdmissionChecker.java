package ConditionalsStatements;

public class AdmissionChecker 
{

public static void main(String[] args) 
{
	int maths = 51;
	int science = 41;
	int english = 41;
	int age = 19;
	
	int totalmarks = maths+science+english;
	
	// age>17
	// every subject marks>50
	// Total marks > 160
	
	
	if(age>17)
	{
		if(maths>50 && science>50 && english>50)
		{
			if(totalmarks>160)
			{
				System.out.println("Student is  eligible");
			}
			else
			{
				System.out.println("Student is not eligible bcoz his/her totalmarks is less than 160");
			}
		}
		else
		{
		 if(maths<50)
			System.out.println("Student is not eligible bcoz his/her maths marks is less than 50");
			
			else if(science<50)
				System.out.println("Student is not eligible bcoz his/her science marks is less than 50");
			
			else if(english<50)
				System.out.println("Student is not eligible bcoz his/her  english marks is less than 50");
		}
	}
	else
	{
		System.out.println("Student is not eligible bcoz his/her age is less than 17");
	}
}

}

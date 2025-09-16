package SS;

public class Demo5 {

public static void main(String[] args) 
{
	String Str = "Ionday";
	
	for(int i = 0;i<Str.length();i++)
	{
		char c = Str.charAt(i);
		if((c!='a' && c!='e' && c!='i' &&  c!='o' && c!='u') && (c!='A' && c!='E' && c!='I' &&  c!='O' && c!='U') )
		{
		System.out.print(c+" ");
		}
	}
}

}

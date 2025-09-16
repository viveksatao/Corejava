package SS;

public class Example
{
public static void main(String[] args) 
{
	String s = "irise";
	String s1 = "irise";
	// s == s1  true;
	// s.equals(s1) true
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s));
	
	s = s.toUpperCase();
	System.out.println(System.identityHashCode(s));
	s1 = s1.toUpperCase();
	System.out.println(System.identityHashCode(s1));
	System.out.println(s1==s);
	System.out.println(s1.equals(s));
	
	
}
	

}

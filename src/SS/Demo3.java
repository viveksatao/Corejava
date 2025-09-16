package SS;

public class Demo3 {

	public static void main(String[] args)
	{
//		String S = "apple";
//		String S1 = "apple";
//		System.out.println(S==S1);
//		System.out.println(System.identityHashCode(S1));
//		System.out.println(System.identityHashCode(S));
//		System.out.println(S.equals(S1));
//		
//		String S2 = new String("apple");
//		System.out.println(System.identityHashCode(S2));
//		String S3 = new String("apple");
//		System.out.println(System.identityHashCode(S3));
//		System.out.println(S2.equals(S3));
//		System.out.println(S2==S3);
		
		String S = "Vivek";
		System.out.println(System.identityHashCode(S));
		S = S.toUpperCase();
		System.out.println(System.identityHashCode(S));
		S = S.toLowerCase();
		System.out.println(System.identityHashCode(S));
		
		
	}

}

package SS;

public class Demo2 {

	public static void main(String[] args) 
	{
		// We can create String using literal , when we create String using literals then it is stored in String Constant Pool
		//SCP= If value is same it will not repeat
		
		String S1 = "Vivek";
		String S2 = "Vivek";
		System.out.println(S1.equals(S2)); // it compares Data
		System.out.println(S1==S2); // it compares Memory Location
		
		
		// We can Create String using new Keyword and that objct is stored in Heap Memory
		// In Heap Memroy -> Values will repeat for Every String 
		String S = new String("Vivek");
		String S4 = new String("Vivek");
		System.out.println(S4==S2); // it gives false because S is stored in Heap and S2 is stored in SCP
		System.out.println(S4.equals(S)); // True
		
	}

}

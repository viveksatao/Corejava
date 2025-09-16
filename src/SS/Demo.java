package SS;

public class Demo {

	public Demo() 
	{
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) 
	{
		String Str = "Vivek Gajanan Satao";
		
		// Some Important inbuilt Methods in String class
		System.out.println(Str.length());
		System.out.println(Str.toLowerCase());
		System.out.println(Str.toUpperCase());
		System.out.println(Str.charAt(0));
		System.out.println(Str.concat(" Nandura"));
		System.out.println(Str.endsWith("o"));
		System.out.println(Str.startsWith("V"));
		System.out.println(Str.indexOf("E"));
		System.out.println(Str.contains("Satao"));
		System.out.println(Str.isEmpty());
	}

}

package Inheritance;

public class Demo1 {

public static void main(String[] args) 
{
	Tiger1 tobj = new Tiger1();
	System.out.println(tobj.a);
	System.out.println(tobj.b);
	
	Animal1 aobj = new Tiger1();
	System.out.println(aobj.d);
	System.out.println(aobj.a);

}

}

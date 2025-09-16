package Inheritance;

public class Demo {

	public static void main(String[] args) {
//		Animal aobj = new Animal();
//		Tiger tobj = new Tiger();
//		tobj.printName();
//		tobj.printColor();
		
////		aobj.printColor(); Parent cant access child data members
//		System.out.println(tobj.salary);
		
		Animal to = new Tiger(); 
		//Here Animal Class gets loaded because we creating reference of animal class and construtor of tiger class gets called 
		// to is object of animal class 
		to.printAge();
		 to.printName();
//		aobj.printName();
//		aobj.printAge();
		
		 //Prefer Notes of suyash
		
		
		
	}

}

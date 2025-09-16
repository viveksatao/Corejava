package staticKeyword;

public class Demo {

public static void main(String[] args) {
	Animal aobj = new Animal();
	System.out.println(aobj.age);
	Animal.printName(); // static method calling
	System.out.println(Animal.age);
}

}

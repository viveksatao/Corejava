package FunctionalInterface;

public class Lion {

	//To boost the performance of our application we have introduced the concept of Stream API 
	public static void main(String[] args) {
		
		Animal a = ()->{
			System.out.println("Lion");
		};
		a.getName();
	}

}

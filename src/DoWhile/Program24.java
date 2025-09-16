package DoWhile;
import java.util.*;
public class Program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int choice;

	    do {
	        
	        System.out.println("\n=== MENU ===");
	        System.out.println("1. Say Hello");
	        System.out.println("2. Show Current Year");
	        System.out.println("3. Exit");
	        System.out.print("Enter your choice (1-3): ");
	        
	        choice = sc.nextInt();

	       
	        switch (choice) {
	            case 1:
	                System.out.println("Hello, user!");
	                break;
	            case 2:
	                System.out.println("The current year is 2025.");
	                break;
	            case 3:
	                System.out.println("Exiting program...");
	                break;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }

	    } while (choice != 3);
	}

	
}



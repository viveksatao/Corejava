package inheritance2;

public class Employee {
       int empid = 102;
        String name = "Vijay";
        static int abc = 1234;
        
        public Employee() 
        {
        	System.out.println("Inside Employee Constructor");
        }
        
        public void printCity()
        {
        	System.out.println("City name : ");
        }
        public void printSalary()
        {
        	System.out.println("Salary: 2500 ");
        }
        
	    // we can access static methods of parent class but we cant override it 
        // all the static methods , charecteristics , static block  ready to use and loaded at the compile time hence we cant override it in child class
        public static void printVehicle()
        {
        	System.out.println("Honda City");
        }
        

       

}

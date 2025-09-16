package Scanner;

public class StaticUse {

     static String collegename = "Shri Guru Gobind Singhji Institute of Engineering and Technology , Vishnupuri , Nanded , Maharashtra , 431606";
   String name;
   int rollno;
   long number;
   String mail;
   
   public StaticUse(String name, int id, long mobile , String mailid)
   {
	   this.name = name;
	   this.rollno = id;
	   this.number = mobile;
	   this.mail = mailid;
   }
   public void printData()
   {
	   System.out.println(name);
	   System.out.println(rollno);
	   System.out.println(number);
	   System.out.println(mail);
   }
  
	
	public static void main(String[] args)
	{
		collegename = "Irise Institute";
		System.out.println(collegename);
		StaticUse sobj1 = new StaticUse("Vivek Satao",27,9325298669L,"viveksatao39@gmail.com");
		sobj1.printData(); 
		System.out.println();
		
		System.out.println(collegename);
		StaticUse sobj2 = new StaticUse("Tushar Satao",26,9325298669L,"tusharsatao39@gmail.com");
		sobj2.printData();
		System.out.println();
		
		System.out.println(collegename);
		StaticUse sobj3 = new StaticUse("Amit Satao",25,9325298669L,"amitsatao39@gmail.com");
		sobj3.printData();
		System.out.println();
		
	}

}

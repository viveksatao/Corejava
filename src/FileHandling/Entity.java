package FileHandling;

public class Entity {

	//Homework
	// Create an entity class-> Student - > id, fName, lName, phoneNumber, city
	//Take input for this values using Scanner
	// Store this data in text file named as -> studentdetails.txt
	// format should be -> id : fName : lName : phoneNumber : city
	// eg -> 1 : abc : xyz : 789456 : Pune
	// Every student should be on new line
	
	private int id;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String city;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", city=" + city + "]";
	}
	
	

}

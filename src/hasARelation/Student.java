package hasARelation;

public class Student {

	
	
	private String name;
	private int id;
	private String city;
	private PersonalDetails details;
	
	public PersonalDetails getDetails() {
		return details;
	}
	public void setDetails(PersonalDetails details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", details=" + details + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}

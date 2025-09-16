package enapsulation;
//22/08/2025

public class Student {
// The main purpose of Encapsulation is that data should not be accessable using its varibale name
	// Encapsulation is simply hiding data
	private int id;
	private String name;
	
//	public void setid(int id)
//	{
//		this.id = id;
//	}
	public int getid()
	{
		return this.id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return this.name;
	}
}

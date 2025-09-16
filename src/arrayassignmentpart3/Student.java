package arrayassignmentpart3;

import java.io.ObjectInputStream.GetField;

public class Student {

	private int id;
	private String name;
	private int marks;
	
	public void setid(int id)
	{
		this.id = id;
	}
	public int getid()
	{
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}

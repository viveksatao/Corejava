package hasARelation;

public class PersonalDetails {



	@Override
	public String toString() {
		return "PersonalDetails [fathername=" + fathername + ", mothername=" + mothername + ", pdetails=" + pdetails
				+ "]";
	}
	private String fathername;
	private String mothername;
	
	
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	
    

}

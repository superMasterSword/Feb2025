package pac1;

public class Person16 {
	
	private String firstName;
	private String lastName;
	private char   gender;
	
	public Person16() {}
	
	public Person16(String fn, String ln, char g) {
		firstName = fn;
		lastName = ln;
		gender = g;
	}
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	
	public char getGender() { return gender; }
	public void setGender(char g) { gender = g; }

}

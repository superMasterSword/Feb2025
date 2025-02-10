package pac1;

public class Person17 {
	
	private String firstName;
	private String lastName;
	private char   gender;
	private String phoneNumber;
	
	public Person17() {}
	
	public Person17(String fn, String ln, char g, String p) {
		firstName = fn;
		lastName = ln;
		gender = g;
		phoneNumber = p;
	}
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	
	public char getGender() { return gender; }
	public void setGender(char g) { gender = g; }
	
	public String getPhoneNumber() { return phoneNumber; }
	public void setPhoneNumber(String p) { phoneNumber = p; }
	
	
	public void displayDetails() {
		
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name:  " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Phone Number: " + phoneNumber);
		
	}

}

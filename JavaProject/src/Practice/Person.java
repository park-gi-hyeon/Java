package Practice;

public class Person {
	private String lastName;
    private String firstName;


    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public Person() {}
    
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getLength() {
        return lastName.length() + firstName.length();
    }
}

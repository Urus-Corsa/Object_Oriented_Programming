public class Person {

    private String FirstName;
    private String LastName;
    private int Age;
    private String SSN;
    private Address Address;


    public Person() {
    }



    public Person(String firstName, String lastName, int age, String ssn, Address address) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        SSN = ssn;
        Address = address;
    }



    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public String getSSN() {
        return SSN;
    }

    public Address getAddress() {
        return Address;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setSSN(String ssn) {
        SSN = ssn;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    public String toString() {
        return "FirstName: " + FirstName + "\nLastName: " + LastName + "\nAge: " +
                Age + "\nAddress: " + Address;

    }

}

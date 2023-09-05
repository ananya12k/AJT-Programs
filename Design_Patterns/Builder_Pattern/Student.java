package Builder_Pattern;

// Student class
public class Student {
    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private int rollNo;

    // Constructor
    public Student(int id) {
        this.id = id;
    }
    public Student( int id,String firstName, String lastName, int rollNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    // toString() method
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + "]";
    }
}

package Builder_Pattern;
// StudentBuilder class
public class StudentBuilder {
    // Fields
    private int id;
    private String firstName="Rahul";
    private String lastName="Kumar";
    private int rollNo=1;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }   
    public Student build() {
        return new Student(firstName, lastName, rollNo);
    }
    
}

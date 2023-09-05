package Builder_Pattern;

public class StudentDirector {
    Student[] students = new Student[3];
    public StudentDirector() {
        students[0] = new StudentBuilder().setId(1).setFirstName("Rahul").setLastName("Kumar").setRollNo(11).build();
        students[1] = new StudentBuilder().setId(2).build();
        students[2] = new StudentBuilder().setId(3).setFirstName("Rahul").setLastName("Kumar").build();
    }
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

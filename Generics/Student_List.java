import java.util.*;

import Iterator_Pattern.Iterator;

public class Student_List {

    public static void main(String[] args) {
        Student s = new Student(10, "sun");
        Student m=new Student(20, "moon");
        Student n=new Student(30, "earth");
        Student k=new Student(40, "star");
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s);
        arr.add(m);
        arr.add(n);
        arr.add(k);
        // Iterator it = arr.iterator();
        // // System.out.println(arr.get(0).age);
        // // System.out.println(arr.get(1).age);

        // while (it.hasNext()) {
        //     System.out.println(it.next()+" ");

        // }
    }
}

class Student {
    public int age;
    public String name;

    Student(int a, String b) {
        age = a;
        name = b;
    }

    Student() {
        age = 0;
        name = null;
    }

}

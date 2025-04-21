package ArrayList;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("sushant", 12));
        student.add(new Student("ras", 32));
        student.add(new Student("sus", 55));

        for (Student students : student) {
            System.out.println(students.getName());
            System.out.println(students.getAge());
        }
    }
}

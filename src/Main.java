public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 21;
        student.marks1 = 20;
        student.marks2 = 30;

        student.average =  student.sum() / 400;


        Student student1 = new Student();
        student1.id = 13;
        student1.marks1 = 25;
        student1.marks2 = 35;
        student1.average = student1.sum();

        if(student.average > student1.average) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
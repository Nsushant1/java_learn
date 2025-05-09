package oop;

public class Student {
    private String name;
    private String college;

    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public static void main(String[] args) {
        Student student = new Student("sushant", "dg");
        System.out.println("Name: " + student.getName());
        System.out.println("College: " + student.getCollege());
    }

}

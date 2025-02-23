package oop;

public class Main {
    public static void main(String[] args) {
        Employee partTimeEmployee = new PartTimeEmployee("sushant", 88, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("ram", 30);
        System.out.println(partTimeEmployee.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }
}

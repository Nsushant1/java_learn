package oop2;

public class Permanent extends Employee {
    public Permanent(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int calculateIncome() {
        return getSalary() * 8;
    }

}

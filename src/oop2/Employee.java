package oop2;

// abstract class banako
public abstract class Employee {
    private String name;
    private int salary;

// constructor declare gareko
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public abstract int calculateIncome();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}

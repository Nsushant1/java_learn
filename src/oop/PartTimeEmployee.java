package oop;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int workingHours, int paymentPerHour) {
        super(name, paymentPerHour);// written to call from employee
        this.workingHours = workingHours;
    }

    @Override // we are overriding a method from employee
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }

}

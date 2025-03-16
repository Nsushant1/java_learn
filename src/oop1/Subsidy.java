package oop1;

public class Subsidy extends Government {
    public Subsidy(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return 0;
    }

}

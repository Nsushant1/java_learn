package oop1;

public class Subsidy extends Government {
    public Subsidy(String name, double price) {
        super(name, price);
        this.taxRate = 0.0;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

}

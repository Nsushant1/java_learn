package oop1;

public class Internal extends Government {
    public Internal(String name, double price) {
        super(name, price);
        this.taxRate=0.13;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
}

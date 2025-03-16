package oop1;

public class Tax extends Government {
    double taxRate;

    public Tax(String name, double price) {
        super(name, price);
        this.taxRate = vatRate;
    }

    public double calculateTax() {
        return getPrice() * taxRate;

    }
}

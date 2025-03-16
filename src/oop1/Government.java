package oop1;

public abstract class Government {
    private String name;
    private double price;
    double importTaxRate;
    double vatRate = 0.13;

    public Government(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateTax();

}

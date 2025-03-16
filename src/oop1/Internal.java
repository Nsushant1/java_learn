package oop1;

public class Internal extends Tax {
    //!initialize constructor
    public Internal(String name, double price) {
       super(name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
}

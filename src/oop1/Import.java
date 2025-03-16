package oop1;

public class Import extends Tax{
    public Import(String name, double price) {
        super(name, price);
        this.importTaxRate=0.05;
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxRate+importTaxRate);//tax 0.13+ import tax 5%
    }

}

package oop1;

public class Main {
    public static void main(String[] args) {
        Government s = new Subsidy("Gas", 1910);
        Government i = new Internal("Mobile Phone", 17240);
        Government im = new Import("Car", 2000000);
        
        System.out.println("Tax Amount :");
        System.out.println(s.getName() + ": Rs." + s.calculateTax());
        System.out.println(i.getName() + ": Rs." + i.calculateTax());
        System.out.println(im.getName() + ": Rs." + im.calculateTax());

        System.out.println("-------------------------------------------------------");

        System.out.println("Prices with tax ");
        System.out.println(s.getName() + ": Rs." + (s.getPrice() + s.calculateTax()));
        System.out.println(i.getName() + ": Rs." + (i.getPrice() + i.calculateTax()));
        System.out.println(im.getName() + ": Rs." + (im.getPrice() + im.calculateTax()));
    }
}

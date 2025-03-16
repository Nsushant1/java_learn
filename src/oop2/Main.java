package oop2;

public class Main {
    public static void main(String[] args) {
        Employee per=new Permanent("sushant", 20000);
        System.out.println(per.calculateIncome());
        System.out.println(per.getName());
    }
}

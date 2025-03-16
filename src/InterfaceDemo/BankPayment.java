package InterfaceDemo;

public class BankPayment implements Payment,SpecialPayment{
    double commission=10;

    public double paywithSpecialAmount(double amount){
        System.out.println("Special paying"+amount);
        return amount +5;
    }

    @Override
    public double payAmount(double amount) {
        System.out.println("Paid bank amount: " + amount);
        return amount;
    }
}

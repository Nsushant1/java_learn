package InterfaceDemo;

public class EsweaPayment implements Payment {

    @Override
    public double payAmount(double amount) {
        System.out.println("Esewa payment" + amount);
        return amount;

    }

}

package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        Payment payment = new BankPayment();
        payment.payAmount(2000);

        Payment payment1=new EsweaPayment();
        payment1.payAmount(7000);

    }
}

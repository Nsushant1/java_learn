package execption;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 20 / 0;// yo run hudaina 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Not valid ");
        }
        System.out.println("continues");
    }
}
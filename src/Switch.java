import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number:");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("The number is1");

                break;

            case 2:
                System.out.println("the number is 2");
                break;

            default:
                System.out.println("INvalid");

                break;
        }
        sc.close();
    }
}

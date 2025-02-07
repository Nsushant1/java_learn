import java.util.Scanner;

class Input{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("The number is "+num);
        sc.close();
    }
}
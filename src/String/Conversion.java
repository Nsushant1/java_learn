package String;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = 3;
        String dataString = String.valueOf(a);

        // User Input leko
        System.out.println("Enter the string:");
        String userInput = sc.nextLine();
        dataString = dataString.concat(userInput);
        System.out.println(dataString);
        
        // try catch
        try {
            Integer b = Integer.parseInt(dataString);
            b = b + 3;
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        }
        sc.close();

    }
}

package basics;
public class If {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 5, 6, 7, 8, };
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even");

            } else {
                System.out.println("Odd");
            }
            if (arr[i] % 3 == 0) {
                System.out.println(" and divisible by 3");
                
            } else {

                System.out.println(" and not divisible by 3");
            }

        }
    }
}

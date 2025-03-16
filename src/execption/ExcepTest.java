package execption;

public class ExcepTest {
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Program continues");
    }
}

package String;

public class Concat {
    public static void main(String[] args) {
        String a = "hello world";
        System.out.println(a);
        // using concat
        a = a.concat("sushant");
        System.out.println(a);
        // without using concat
        a = a + "neupane";
        System.out.println(a);

    }
}

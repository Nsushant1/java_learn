package String;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);

        sb.insert(7, "Java");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);
    }

}

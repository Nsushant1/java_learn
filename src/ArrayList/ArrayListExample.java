package ArrayList;
import java.util.*;


public class ArrayListExample {
    public static void main(String[] args) {
    List <String> data = new ArrayList<>();
    data.add("apple");
    data.add("banana");
    data.add("mango");
    String returnedData= data.get(2);
    System.out.println(returnedData);

    }
}

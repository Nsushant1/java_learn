package ArrayList1;

import java.util.ArrayList;
import java.util.List;

public class ArrExample {
    public static void main(String[] args) {
        List <Person> data=new ArrayList<>();
        data.add(new Person("Sushant",2));
        data.add(new Person("kishor",87));
        data.add(new Person("suman",34));

        for (Person p : data) {
            System.out.println(p.getName());
            System.out.println(p.getId());
        }

        
    
    }
}

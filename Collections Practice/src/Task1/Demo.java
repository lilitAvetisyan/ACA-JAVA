package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lill on 9/22/16.
 */
public class Demo {
    public static void main(String []argh) {

        ArrayList<Person> list = new ArrayList<Person>();

        Person p1 = new Person("Ender", "Wiggin", 1122, "555-1111");
        list.add(p1);
        Person p2 = new Person("Maria", "Macarena", 7788,"555-2222");
        list.add(p2);
        Person p3 = new Person ("Harry", "Potter", 9955, "555-3333");
        list.add(p3);
        Person p4 = new Person("Honor", "Harrington", 8888,  "555-4444");
        list.add(p4);
        Person p5 = new Person("R.Daneel", "Olivaw",  5555, "555-5555");
        list.add(p5);
        Person p6 = new Person("Peter", "Parker", 1234, "555-6666");
        list.add(p6);

        Map<String, Person> lastNamelist = new HashMap<>();
        Map<Integer, Person> IDlist = new HashMap<>();


        lastNamelist.put(p1.lastName, list.get(0));
        lastNamelist.put(p2.lastName, list.get(1));
        lastNamelist.put(p3.lastName, list.get(2));
        lastNamelist.put(p4.lastName, list.get(3));
        lastNamelist.put(p5.lastName, list.get(4));
        lastNamelist.put(p6.lastName, list.get(5));

        IDlist.put(p1.idNumber, list.get(0));
        IDlist.put(p2.idNumber, list.get(1));
        IDlist.put(p3.idNumber, list.get(2));
        IDlist.put(p4.idNumber, list.get(3));
        IDlist.put(p5.idNumber, list.get(4));
        IDlist.put(p6.idNumber, list.get(5));


        Person Macarena = lastNamelist.get("Macarena");
        Macarena.printInfo();

        Person Potter = lastNamelist.get("Potter");
        Potter.printInfo();

        Person id1234 = IDlist.get(1234);
        id1234.printInfo();

    }

}

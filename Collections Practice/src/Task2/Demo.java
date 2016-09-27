package Task2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lill on 9/22/16.
 */
public class Demo {
    public static void main(String [] args) {


        Teacher t1 = new Teacher("Bertie", "Hansel");
        Teacher t2 = new Teacher("James", "McCoy");
        Teacher t3 = new Teacher("Anastacia", "Brooklyn");
        Teacher t4 = new Teacher("Jim", "Kerry");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hovo Hovoyan");
        list1.add("Mko Mkoyan");
        list1.add("Dmbo Dmboyan");
        list1.add("Parandzem Parandzemyan");
        list1.add("Varsik Varsikyan");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Vasil Vasilyan");
        list2.add("Sago Sagoyan");
        list2.add("Karapet Karapetyan");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hovo Hovoyan");
        list3.add("Sago Sagoyan");
        list3.add("Cactus Cactusyan");
        list3.add("Taguhi Taguhyan");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Parandzem Parandzemyan");
        list4.add("Taguhi Taguhyan");
        list4.add("Harisa Harisyan");

        Map<Teacher, ArrayList<String>> teacherStudent = new HashMap<Teacher, ArrayList<String>>();
        teacherStudent.put(t1, list1);
        teacherStudent.put(t2, list2);
        teacherStudent.put(t3, list3);
        teacherStudent.put(t4, list4);






}
}

package lesson16;

import java.util.Arrays;
import java.util.List;

public class App02 {
    public static void main(String[] args) {
        List<String> list = new CustomLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add("1st");
        list.add("2nd");
        list.add("3rd");

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        List<String> objects = Arrays.asList("4th", "5th");

        list.addAll(objects);

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println(list);

        list.removeAll(objects);

        System.out.println(list);
    }
}

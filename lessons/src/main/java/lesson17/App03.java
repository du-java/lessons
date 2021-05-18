package lesson17;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App03 {
    public static void main(String[] args) {

//        LinkedList<String> stringList = new LinkedList<>();
        Queue<String> strings = new LinkedList<>();

        strings.add("q1");
        strings.add("q2");
        strings.add("q3");
        strings.add("q4");

        System.out.println(strings);

        System.out.println(strings.element());
        System.out.println(strings);
        System.out.println(strings.peek());
        System.out.println(strings);
        System.out.println(strings.poll());
        System.out.println(strings);
    }
}

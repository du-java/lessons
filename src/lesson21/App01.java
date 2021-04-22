package lesson21;

import java.util.ArrayDeque;
import java.util.Deque;

public class App01 {
    public static void main(String[] args) {
        final Deque<String> strings = new ArrayDeque<>();

        strings.add("first");
        strings.add("second");
        strings.push("third");
        strings.offerLast("fourth");

        System.out.println(strings);

        final String pop = strings.pop();
        System.out.println(strings);

        final String peek = strings.peek();
        System.out.println(strings);

        final String peekLast = strings.peekLast();
        System.out.println(strings);

        strings.offer(pop);
        System.out.println(strings);

        final String pollLast = strings.pollLast();
        System.out.println(strings);
    }
}

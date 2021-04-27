package lesson22;

import java.util.Random;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {

        final Random random = new Random();

        final App01 app01 = new App01();

        int maxSize = 100;

        final long count = Stream
                .generate(random::nextInt)
                .limit(maxSize)
                .filter(App01::test)
                .map(app01::apply)
                .peek(System.out::print)
                .map(x -> x + maxSize)
                .count();

//        maxSize++;
    }

    static Integer get() {
        return new Random().nextInt(255);
    }

    static boolean test(Integer integer) {
        return integer != 0;
    }

    char apply(Integer integer) {
        return (char) integer.intValue();
    }
}

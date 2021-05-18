package lesson22;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App02 {
    public static void main(String[] args) {

        final Random random = new Random();

        final App02 app01 = new App02();

        int maxSize = 100;

        final Stream<Character> characterStream = Stream
                .generate(random::nextInt)
                .limit(maxSize)
                .filter(App02::test)
                .map(app01::apply);

        characterStream
                .peek(System.out::print)
                .map(x -> x + maxSize)
                .collect(Collectors.toList());

        final long count1 = characterStream
                .count();

        System.out.println(count1);

//        maxSize++;
    }

    static boolean test(Integer integer) {
        return integer != 0;
    }

    char apply(Integer integer) {
        return (char) integer.intValue();
    }
}

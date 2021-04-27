package lesson22;

import java.util.Random;

public class App09 {

    public static void main(String[] args) {

        final int test = test(new CustomFunction() {
            @Override
            public int count() {
                test();
                return 123;
            }

//            @Override
//            public int test() {
//                return 0;
//            }
        });

        final int test1 = test(() -> 123);

        final int test2 = test(() -> new Random().nextInt());
    }

    static int test(CustomFunction customFunction) {
        return customFunction.count();
    }
}

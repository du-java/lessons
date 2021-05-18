package lesson22;

@FunctionalInterface
public interface CustomFunction {
    int count();

//    int test();

    default void test() {
        System.out.println("FunctionalInterface CustomFunction");
    }
}

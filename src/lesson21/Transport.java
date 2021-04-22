package lesson21;

public interface Transport {

    int CONST = 10;

    default String getString() {
        return Transport.class.getName();
    }

    String get();
}

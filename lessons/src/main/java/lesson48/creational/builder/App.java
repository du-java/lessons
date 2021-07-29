package lesson48.creational.builder;

public class App {
    public static void main(String[] args) {
        final Car.CarBuilder builder = Car.builder();
        builder
                .name1("")
                .name2("")
                .build();
    }
}

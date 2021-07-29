package lesson48.creational.abstract_factory;

public class App {
    public static void main(String[] args) {

        System.out.println("Corolla");
        final ToyotaFactory corollaFactory = ToyotaFactory.getInstance(ModelType.COROLLA);

        System.out.println(corollaFactory.blue());
        System.out.println(corollaFactory.red());

        System.out.println("Tundra");
        final ToyotaFactory tundraFactory = ToyotaFactory.getInstance(ModelType.TUNDRA);

        System.out.println(tundraFactory.blue());
        System.out.println(tundraFactory.red());
    }
}

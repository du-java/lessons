package lesson48.behavioral.strategy;

public class App {
    public static void main(String[] args) {

        Strategy strategy;
        if ("db".equalsIgnoreCase(args[0])) {
            strategy = new DbStrategy();
        } else {
            strategy = new FileStrategy();
        }

        final Service service = new Service(strategy);
        service.makeSomething();

        service.makeSomething(new FileStrategy());
    }
}
